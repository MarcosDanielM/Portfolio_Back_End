
package com.portfolio.mdm.service;


import com.portfolio.mdm.entity.Educacion; 
import com.portfolio.mdm.interfaces.IEducacion;
import com.portfolio.mdm.repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements IEducacion{
    @Autowired
     REducacion rEducacion;
    
    @Override
    public List<Educacion> list() {
        List<Educacion> educacion = rEducacion.findAll();
        return educacion;
    }
    
    @Override
     public Educacion getOne(Long id){
        Educacion edu = rEducacion.findById(id).orElse(null);
        return edu;
     }
     
     public Optional<Educacion> getByInstitucion(String institucion){
         return rEducacion.findByInstitucion(institucion);
     }
     
     public void save(Educacion edu){
         rEducacion.save(edu);
     }
     
     @Override
     public void delete(Long id){
         rEducacion.deleteById(id);
     }
     
     public boolean existsById(Long id){
         return rEducacion.existsById(id);
     }
     
     public boolean existsByInstitucion(String institucion){
         return rEducacion.existsByInstitucion(institucion);
     }

     
}
