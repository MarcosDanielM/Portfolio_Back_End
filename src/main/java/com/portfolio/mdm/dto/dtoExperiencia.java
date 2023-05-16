package com.portfolio.mdm.dto;

import javax.validation.constraints.NotBlank;

public class dtoExperiencia {

    
    @NotBlank
    private String empresa;
    
    @NotBlank
    private String posicion;
    
    @NotBlank
    private String tareas;
    
    @NotBlank
    private String inicio;
    
    @NotBlank
    private String fin;
    
    @NotBlank
    private String logo;
    
    //Constructor

    public dtoExperiencia() {
    }

    public dtoExperiencia(String empresa, String posicion, String tareas, String inicio, String fin, String logo) {
        this.empresa = empresa;
        this.posicion = posicion;
        this.tareas = tareas;
        this.inicio = inicio;
        this.fin = fin;
        this.logo = logo;
    }
    
    
    //Getter and Setter

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
}
