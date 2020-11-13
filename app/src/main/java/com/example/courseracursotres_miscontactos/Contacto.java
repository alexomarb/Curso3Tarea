package com.example.courseracursotres_miscontactos;

public class Contacto {
    private String nombre;
    private int foto;

    public Contacto(int foto, String nombre) {
        this.foto = foto;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

}
