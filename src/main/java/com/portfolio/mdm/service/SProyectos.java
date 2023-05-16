package com.portfolio.mdm.service;

import com.portfolio.mdm.entity.Proyectos;
import com.portfolio.mdm.interfaces.IProyectos;
import com.portfolio.mdm.repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos implements IProyectos {
    @Autowired
     RProyectos rProyectos;
    public List<Proyectos> list(){
         return rProyectos.findAll();
     }
     
    @Override
     public Proyectos getOne(Long id){
        Proyectos pro = rProyectos.findById(id).orElse(null);
        return pro;
     }
     
     
     public Optional<Proyectos> getByTitulo(String titulo){
         return rProyectos.findByTitulo(titulo);
     }
     
     @Override
     public void save(Proyectos edu){
         rProyectos.save(edu);
     }
     
     @Override
     public void delete(Long id){
         rProyectos.deleteById(id);
     }
     
     public boolean existsById(Long id){
         return rProyectos.existsById(id);
     }
     
     public boolean existsByTitulo(String titulo){
         return rProyectos.existsByTitulo(titulo);
     }
}
