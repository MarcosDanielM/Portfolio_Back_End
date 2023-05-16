package com.portfolio.mdm.dto;

import javax.validation.constraints.NotBlank;

public class dtoPersona {
    @NotBlank
    private String nombre;
    @NotBlank
    private String titulo;
    @NotBlank
    private String sobreMi;
    @NotBlank
    private String img;
    @NotBlank
    private String banner;
    @NotBlank
    private String email;
    @NotBlank
    private String celular;
    @NotBlank
    private String ubicacion;


    //consructor

    public dtoPersona() {
    }

    public dtoPersona(String nombre, String titulo, String sobreMi, String img, String banner, String email, String celular, String ubicacion) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.img = img;
        this.banner = banner;
        this.email = email;
        this.celular = celular;
        this.ubicacion = ubicacion;
    }
    
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSobreMi() {
        return sobreMi;
    }

    public void setSobreMi(String sobreMi) {
        this.sobreMi = sobreMi;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
