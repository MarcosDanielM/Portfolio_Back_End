package com.portfolio.mdm.service;

import com.portfolio.mdm.entity.Persona;
import com.portfolio.mdm.interfaces.IPersonaService;
import com.portfolio.mdm.repository.IPersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService{
    @Autowired 
    IPersonaRepository persoRep;
    
    @Override
    public List<Persona> list() {
        List<Persona> persona = persoRep.findAll();
        return persona;
    }

    @Override
    public void save(Persona persona) {
        persoRep.save(persona);
    }

    @Override
    public void delete(Long id) {
        persoRep.deleteById(id);
    }

    @Override
    public Persona getOne(Long id) {
        Persona perso = persoRep.findById(id).orElse(null);
        return perso;
    }

    public void edit(Persona persona) {
        persoRep.save(persona);
    }
    
    public boolean existsById(Long id){
         return persoRep.existsById(id);
     }
     
     
    
}
