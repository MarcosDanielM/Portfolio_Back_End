package com.portfolio.mdm.dto;

import javax.validation.constraints.NotBlank;

public class dtoEducacion {
    @NotBlank
    private String institucion;
    
    @NotBlank
    private String curso;
    
    @NotBlank
    private String inicio;
    
    @NotBlank
    private String fin;
    
    @NotBlank
     private String certificado;
    
    @NotBlank
    private String logo;
    
    
    
    //Constructor

    public dtoEducacion(String institucion, String curso, String inicio, String fin, String certificado, String logo) {
        this.institucion = institucion;
        this.curso = curso;
        this.inicio = inicio;
        this.fin = fin;
        this.certificado = certificado;
        this.logo = logo;
    }
    
    //Getter and Setter

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
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

    public String getCertificado() {
        return certificado;
    }

    public void setCertificado(String certificado) {
        this.certificado = certificado;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    
    
   
  
}
