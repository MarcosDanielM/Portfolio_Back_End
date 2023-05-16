package com.portfolio.mdm.security;


public class Mensaje {
    private String mensajes;
    
    //Constructor

    public Mensaje() {
    }

    public Mensaje(String mensaje) {
        this.mensajes = mensaje;
    }
    //Getter y Setter

    public String getMensaje() {
        return mensajes;
    }

    public void setMensaje(String mensaje) {
        this.mensajes = mensaje;
    }
    
}