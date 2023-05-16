package com.portfolio.mdm.controller;

import com.portfolio.mdm.dto.dtoEducacion; 
import com.portfolio.mdm.entity.Educacion; 
import com.portfolio.mdm.security.Mensaje;
import com.portfolio.mdm.service.SEducacion;
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
@RequestMapping("educacion")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CEducacion {
    @Autowired
    SEducacion sEducacion;
    
     @GetMapping("/lista")
    public ResponseEntity<List<Educacion>> list(){
        List<Educacion> list = sEducacion.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Educacion> detail(@PathVariable("id") Long id){
        Educacion experiencia = sEducacion.getOne(id);
        return new ResponseEntity(experiencia, HttpStatus.OK);
    }  
    
   
    
    //Crear experiencia
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoEducacion dtoedu){      
        if(StringUtils.isBlank(dtoedu.getInstitucion()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
        Educacion educacion = new Educacion(dtoedu.getInstitucion(), dtoedu.getCurso(), dtoedu.getInicio(), dtoedu.getFin(), dtoedu.getCertificado(), dtoedu.getLogo());
        sEducacion.save(educacion);
        
        return new ResponseEntity(new Mensaje("Educacion agregada"), HttpStatus.OK);
    }
    
    
    //Editar experiencia
   /* @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoEducacion dtoedu){
        //Validamos si existe el ID
        if(!sEducacion.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
       //No puede estar vacio
        if(StringUtils.isBlank(dtoedu.getInstitucion()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Educacion educacion = sEducacion.getOne(id).get();
        educacion.setInstitucion(dtoedu.getInstitucion());
        educacion.setCurso(dtoedu.getCurso());
        educacion.setInicio(dtoedu.getInicio());
        educacion.setFin(dtoedu.getFin());
        educacion.setCertificado(dtoedu.getCertificado());
        educacion.setLogo(dtoedu.getLogo());
        
        sEducacion.save(educacion);
        return new ResponseEntity(new Mensaje("Educacion actualizada"), HttpStatus.OK);
             
    }*/
    
    //Editar experiencia
    
    @PutMapping("/update/{id}")
    public Educacion edit(@PathVariable Long id,
                        @RequestParam("institucion")String nuevaInstitucion,
                        @RequestParam("curso")String nuevoCurso,
                        @RequestParam("inicio")String nuevoInicio,
                        @RequestParam("fin")String nuevoFin,
                        @RequestParam("certificado")String nuevoCertificado,
                        @RequestParam("logo")String nuevoLogo) {
        Educacion educacion = sEducacion.getOne(id);
         
        educacion.setInstitucion(nuevaInstitucion);
        educacion.setCurso(nuevoCurso);
        educacion.setInicio(nuevoInicio);
        educacion.setFin(nuevoFin);
        educacion.setCertificado(nuevoCertificado);
        educacion.setLogo(nuevoLogo);
        
        
        sEducacion.save(educacion);
        return educacion;
    }
    
    
    //Borrar experiencia/*
    /*@DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sEducacion.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sEducacion.delete(id);
        return new ResponseEntity(new Mensaje("Experiencia eliminada"), HttpStatus.OK);
    }
    */
     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        sEducacion.delete(id);
    }
    
    
}
