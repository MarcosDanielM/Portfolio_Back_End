package com.portfolio.mdm.interfaces;

import com.portfolio.mdm.entity.Proyectos;
import java.util.List;

public interface IProyectos {
    //Traer una lista de personas
    public List<Proyectos> list();
    
    //Guardar un objeto de tipo Persona
    public void save(Proyectos proyectos);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delete(Long id);
    
    //Buscar una persona por ID
    public Proyectos getOne(Long  id);
}
