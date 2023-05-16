
package com.portfolio.mdm.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String img;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String titulo;
    
    @Lob
    @NotNull
    @Size(min = 1, max = 5000, message = "no cumple con la longitud")
    private String sobreMi;
    
    @NotNull
    @Size(min = 1, max = 400, message = "no cumple con la longitud")
    private String banner;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 1, max = 40, message = "no cumple con la longitud")
    private String celular;
    
    @NotNull
    @Size(min = 1, max = 100, message = "no cumple con la longitud")
    private String ubicacion;

    //Constructor

    public Persona() {
    }

    public Persona(String nombre, String img, String titulo, String sobreMi, String banner, String email, String celular, String ubicacion) {
        
        this.nombre = nombre;
        this.img = img;
        this.titulo = titulo;
        this.sobreMi = sobreMi;
        this.banner = banner;
        this.email = email;
        this.celular = celular;
        this.ubicacion = ubicacion;
    }
    
    
    
    
    //Getter y Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
