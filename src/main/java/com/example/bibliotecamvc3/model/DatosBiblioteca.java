package com.example.bibliotecamvc3.model;

import com.example.bibliotecamvc3.controller.Biblioteca;

public class DatosBiblioteca {
    private int id;
    private String genero;
    private String titulo;

    public DatosBiblioteca(int id, String genero, String titulo) {
        this.id = id;
        this.genero=genero;
        this.titulo=titulo;
    }


    public DatosBiblioteca() {}

    public int getId(){
        return id;
    }

    public String getGenero(){
        return genero;
    }

    public String getTitulo(){
        return  titulo;
    }
}
