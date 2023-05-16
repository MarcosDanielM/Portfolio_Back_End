package com.portfolio.mdm.controller;

import com.portfolio.mdm.dto.dtoExperiencia;
import com.portfolio.mdm.entity.Experiencia;
import com.portfolio.mdm.security.Mensaje;
import com.portfolio.mdm.service.SExperiencia;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("experiencia")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CExperiencia {
    @Autowired
    SExperiencia sExperiencia;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Experiencia>> list(){
        List<Experiencia> list = sExperiencia.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Experiencia> detail(@PathVariable("id") Long id){
        Experiencia experiencia = sExperiencia.getOne(id);
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }  
    
    //Crear experiencia
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoExperiencia dtoexp){      
        if(StringUtils.isBlank(dtoexp.getEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
        Experiencia experiencia = new Experiencia(dtoexp.getEmpresa(), dtoexp.getPosicion(), dtoexp.getTareas(), dtoexp.getInicio(), dtoexp.getFin(), dtoexp.getLogo());
        sExperiencia.save(experiencia);
        
        return new ResponseEntity(new Mensaje("Experiencia agregada"), HttpStatus.OK);
    }
    
    
    
    //Editar experiencia
    
    @PutMapping("/update/{id}")
    public Experiencia edit(@PathVariable Long id,
                        @RequestParam("empresa")String nuevaEmpresa,
                        @RequestParam("posicion")String nuevaPosicion,
                        @RequestParam("tarea")String nuevaTarea,
                        @RequestParam("inicio")String nuevoInicio,
                        @RequestParam("fin")String nuevoFin,
                        @RequestParam("logo")String nuevoLogo) {
        Experiencia experiencia = sExperiencia.getOne(id);
         
        experiencia.setEmpresa(nuevaEmpresa);
        experiencia.setPosicion(nuevaPosicion);
        experiencia.setTareas(nuevaTarea);
        experiencia.setInicio(nuevoInicio);
        experiencia.setFin(nuevoFin);
        experiencia.setLogo(nuevoLogo);
        
        
        sExperiencia.save(experiencia);
        return experiencia;
    }
    
    
    /*
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoExperiencia dtoexp){
        //Validamos si existe el ID
        if(!sExperiencia.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoexp.getEmpresa()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Experiencia experiencia = sExperiencia.getOne(id).get();
        experiencia.setEmpresa(dtoexp.getEmpresa());
        experiencia.setPosicion(dtoexp.getPosicion());
        experiencia.setTareas(dtoexp.getTareas());
        experiencia.setInicio(dtoexp.getInicio());
        experiencia.setFin(dtoexp.getFin());
        experiencia.setLogo(dtoexp.getLogo());
        
        
        sExperiencia.save(experiencia);
        return new ResponseEntity(new Mensaje("Experiencia actualizada"), HttpStatus.OK);
             
    }
    */
    //Borrar experiencia
    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sExperiencia.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sExperiencia.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }*/
    
     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        sExperiencia.delete(id);
    }
    
    
}
