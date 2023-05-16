package com.portfolio.mdm.service;

import com.portfolio.mdm.entity.Skills;
import com.portfolio.mdm.interfaces.ISkills;
import com.portfolio.mdm.repository.RSkills;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SSkills implements ISkills{
    @Autowired
    RSkills sSkills;
    
    @Override
    public List<Skills> list(){
         return sSkills.findAll();
     }
     
     @Override
     public Skills getOne(Long id){
        Skills ski = sSkills.findById(id).orElse(null);
        return ski;
     }
      
     
     public Optional<Skills> getByLenguaje(String lenguaje){
         return sSkills.findByLenguaje(lenguaje);
     }
     
     @Override
     public void save(Skills ski){
         sSkills.save(ski);
     }
     
     @Override
     public void delete(Long id){
         sSkills.deleteById(id);
     }
     
     public boolean existsById(Long id){
         return sSkills.existsById(id);
     }
     
     public boolean existsByLenguaje(String lenguaje){
         return sSkills.existsByLenguaje(lenguaje);
     }
}
