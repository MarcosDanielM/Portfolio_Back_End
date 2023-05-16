package com.portfolio.mdm.dto;

import javax.validation.constraints.NotBlank;

public class dtoSkills {
    
    @NotBlank
    private String lenguaje;
    
    @NotBlank
    private String progreso;
    
    @NotBlank
    private String icono;
    
    @NotBlank
    private String logo;
     
    @NotBlank
    private String color;
    
    @NotBlank
    private String size;
    
    //Constructor

    public dtoSkills() {
    }

    public dtoSkills(String lenguaje, String progreso, String icono, String logo,  String color, String size) {
        this.lenguaje = lenguaje;
        this.progreso = progreso;
        this.icono = icono;
        this.logo = logo;
        this.color = color;
        this.size = size;
    }
    
    
    //Getters and Setters

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }

    public String getProgreso() {
        return progreso;
    }

    public void setProgreso(String progreso) {
        this.progreso = progreso;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }
    
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
