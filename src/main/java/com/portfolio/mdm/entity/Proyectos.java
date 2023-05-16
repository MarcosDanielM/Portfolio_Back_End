package com.portfolio.mdm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String realizacion;
    private String img;
    private String descripcion;
    private String codigo;
    private String demo;
    
    //Constructor

    public Proyectos() {
    }

    public Proyectos(String titulo, String realizacion, String img, String descripcion, String codigo, String demo) {
        this.titulo = titulo;
        this.realizacion = realizacion;
        this.img = img;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.demo = demo;
    }
    
    
    //Getter and Setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRealizacion() {
        return realizacion;
    }

    public void setRealizacion(String realizacion) {
        this.realizacion = realizacion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }
    
    
    
    
}
