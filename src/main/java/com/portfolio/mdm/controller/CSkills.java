package com.portfolio.mdm.controller;

import com.portfolio.mdm.dto.dtoSkills;
import com.portfolio.mdm.entity.Skills;
import com.portfolio.mdm.security.Mensaje;
import com.portfolio.mdm.service.SSkills;
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
@RequestMapping("skills")
@CrossOrigin(origins = {"http://localhost:4200"})
public class CSkills {
    
    @Autowired
    SSkills sSkills;
    
    @GetMapping("/lista")
    public ResponseEntity<List<Skills>> list(){
        List<Skills> list = sSkills.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Skills> detail(@PathVariable("id") Long id){
        Skills skills = sSkills.getOne(id);
        return new ResponseEntity(skills, HttpStatus.OK);
    }  
    
    //Crear experiencia
    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody dtoSkills dtoski){      
        if(StringUtils.isBlank(dtoski.getLenguaje()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
       
        Skills skills = new Skills(
                dtoski.getLenguaje(), dtoski.getProgreso(), dtoski.getIcono(), dtoski.getLogo(),dtoski.getColor(), dtoski.getSize());
        sSkills.save(skills);
         
        return new ResponseEntity(new Mensaje("Skill agregada"), HttpStatus.OK);
    }
    
    
    
    //Editar experiencia
   /* @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody dtoSkills dtoski){
        //Validamos si existe el ID
        if(!sSkills.existsById(id))
            return new ResponseEntity(new Mensaje("El ID no existe"), HttpStatus.BAD_REQUEST);
        //No puede estar vacio
        if(StringUtils.isBlank(dtoski.getLenguaje()))
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        
        Skills skills = sSkills.getOne(id).get();
        
        skills.setLenguaje(dtoski.getLenguaje());
        skills.setProgreso(dtoski.getProgreso());
        skills.setIcono(dtoski.getIcono());
        skills.setColor(dtoski.getColor());

      
        sSkills.save(skills);
        return new ResponseEntity(new Mensaje("Skill actualizada"), HttpStatus.OK);
             
    }*/
    
    @PutMapping("/update/{id}")
    public Skills edit(@PathVariable Long id,
                        @RequestParam("lenguaje")String nuevoLenguaje,
                        @RequestParam("progreso")String nuevoProgreso,
                        @RequestParam("icono")String nuevoIcono,
                        @RequestParam("color")String nuevoColor) {
        Skills skills = sSkills.getOne(id);
         
        skills.setLenguaje(nuevoLenguaje);
        skills.setProgreso(nuevoProgreso);
        skills.setIcono(nuevoIcono);
        skills.setColor(nuevoColor);
        
        
        sSkills.save(skills);
        return skills;
    }
    
    
    //Borrar Skill
    /*
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!sSkills.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sSkills.delete(id);
        return new ResponseEntity(new Mensaje("Skill eliminada"), HttpStatus.OK);
    }
    */
     @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        sSkills.delete(id);
    }
}
