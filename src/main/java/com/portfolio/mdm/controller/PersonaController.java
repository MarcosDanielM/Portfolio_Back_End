package com.portfolio.mdm.controller;

import com.portfolio.mdm.dto.dtoPersona;
import com.portfolio.mdm.entity.Persona;
import com.portfolio.mdm.security.Mensaje;
import com.portfolio.mdm.service.ImpPersonaService;
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
@RequestMapping("persona")//localhost:8080/experiencia
@CrossOrigin(origins={"http://localhost:4200"}) //direccion frontEnd Angular

public class PersonaController {
    @Autowired ImpPersonaService imPersoServ;//Verificar Imp o i
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = imPersoServ.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") Long id){
        Persona perso = imPersoServ.getOne(id);
        return new ResponseEntity(perso, HttpStatus.OK);
    }       
    
    
    @PostMapping("/create")
    public void save(@RequestBody Persona persona){
        imPersoServ.save(persona);
    }
    
   
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        imPersoServ.delete(id);
    }
    
    @PutMapping("/update/{id}")
    public Persona edit(@PathVariable Long id,
                        @RequestParam("nombre")String nuevoNombre,
                        @RequestParam("img")String nuevaImg,
                        @RequestParam("titulo")String nuevoTitulo,
                        @RequestParam("sobreMi")String nuevoSobreMi,
                        @RequestParam("banner")String nuevoBanner,
                        @RequestParam("email")String nuevoEmail,
                        @RequestParam("celular")String nuevoCelular,
                        @RequestParam("ubicacion")String nuevoUbicacion){
        Persona persona = imPersoServ.getOne(id);
        
        persona.setNombre(nuevoNombre);
        persona.setImg(nuevaImg);
        persona.setTitulo(nuevoTitulo);
        persona.setSobreMi(nuevoSobreMi);
        persona.setBanner(nuevoBanner);
        persona.setEmail(nuevoEmail);
        persona.setCelular(nuevoCelular);
        persona.setUbicacion(nuevoUbicacion);
        
        imPersoServ.save(persona);
        return persona;
    }
    
   
    
    
    
    
      
}
