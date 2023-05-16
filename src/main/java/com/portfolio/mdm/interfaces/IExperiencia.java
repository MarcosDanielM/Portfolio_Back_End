package com.portfolio.mdm.interfaces;

import com.portfolio.mdm.entity.Experiencia;
import java.util.List;

public interface IExperiencia {

    //Traer una lista de personas
    public List<Experiencia> list();
    
    //Guardar un objeto de tipo Persona
    public void save(Experiencia experiencia);
    
    //Eliminar un objeto pero lo buscamos por ID
    public void delete(Long id);
    
    //Buscar una persona por ID
    public Experiencia getOne(Long  id);
}
