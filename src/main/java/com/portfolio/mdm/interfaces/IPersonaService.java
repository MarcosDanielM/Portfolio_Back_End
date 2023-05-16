package com.portfolio.mdm.interfaces;

import com.portfolio.mdm.entity.Persona;
import java.util.List;

public interface IPersonaService {
    
    //Traer una lista de personas
    public List<Persona> list();
    
    //Guardar un objeto de tipo Persona
    public void save(Persona persona);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delete(Long id);
    
    //Buscar una persona por ID
    public Persona getOne(Long  id);
    
}