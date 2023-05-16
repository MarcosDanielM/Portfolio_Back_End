package com.portfolio.mdm.interfaces;

import com.portfolio.mdm.entity.Skills;
import java.util.List;

public interface ISkills {
    //Traer una lista de personas
    public List<Skills> list();
    
    //Guardar un objeto de tipo Persona
    public void save(Skills skills);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delete(Long id);
    
    //Buscar una persona por ID
    public Skills getOne(Long  id);
}
