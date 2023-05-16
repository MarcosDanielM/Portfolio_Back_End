package com.portfolio.mdm.dto;

import javax.validation.constraints.NotBlank;

public class dtoProyectos {
    
    @NotBlank
    private String titulo;
    
    @NotBlank
    private String realizacion;
    
    @NotBlank
    private String img;
    
    @NotBlank
    private String descripcion;
    
    @NotBlank
    private String codigo;
    
    @NotBlank
    private String demo;
    
    //Constructor

    public dtoProyectos() {
    }

    public dtoProyectos(String titulo, String realizacion, String img, String descripcion, String codigo, String demo) {
        this.titulo = titulo;
        this.realizacion = realizacion;
        this.img = img;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.demo = demo;
    }
    
    //Getters and Setters

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
