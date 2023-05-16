package com.portfolio.mdm.service;

import com.portfolio.mdm.entity.Experiencia;
import com.portfolio.mdm.interfaces.IExperiencia;
import com.portfolio.mdm.repository.RExperiencia;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia implements IExperiencia{
     @Autowired
     RExperiencia rExperiencia;
    
     
    @Override
    public List<Experiencia> list() {
        List<Experiencia> experiencia = rExperiencia.findAll();
        return experiencia;
    }
     
     @Override
     public Experiencia getOne(Long id){
        Experiencia expe = rExperiencia.findById(id).orElse(null);
        return expe;
     }
     
     
     public Optional<Experiencia> getByEmpresa(String empresa){
         return rExperiencia.findByEmpresa(empresa);
     }
     @Override
     public void save(Experiencia expe){
         rExperiencia.save(expe);         
     }
     
     //Edit
     public void edit(Experiencia experiencia) {
        rExperiencia.save(experiencia);
    }
     
     @Override
     public void delete(Long id){
         rExperiencia.deleteById(id);
     }
     
     
    
     public boolean existsById(int id){
         return rExperiencia.existsById(id);
     }
     
     public boolean existsByEmpresa(String empresa){
         return rExperiencia.existsByEmpresa(empresa);
     }
 
     
    
 
}
