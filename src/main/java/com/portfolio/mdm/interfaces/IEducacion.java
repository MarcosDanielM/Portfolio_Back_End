package com.portfolio.mdm.interfaces;

import com.portfolio.mdm.entity.Educacion;
import java.util.List;

public interface IEducacion {
    
     //Traer una lista de personas
    public List<Educacion> list();
    
    //Guardar un objeto de tipo Persona
    public void save(Educacion educacion);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delete(Long id);
    
    //Buscar una persona por ID
    public Educacion getOne(Long  id);
}
