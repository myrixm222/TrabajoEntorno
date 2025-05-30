package com.trabajoentornos;


public class Usuario {


    private String nombre;
    private String email;
    private Cesta cesta;


    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.cesta = new Cesta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public Cesta getCesta() {
        return cesta;
    }


    public void setCesta(Cesta cesta) {
        this.cesta = cesta;
    }
}

