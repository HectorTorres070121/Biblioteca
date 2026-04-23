package com.example.bibliotecamvc3.controller;

import com.example.bibliotecamvc3.model.DatosBiblioteca;

public class Biblioteca {
    DatosBiblioteca Datos = new DatosBiblioteca(0, "", "");
    //logica para mostrar y registrar libros
    protected void onBotonRegistrarClick() {
        try {
            int id = Integer.parseInt(txtId.getText());
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            DatosBiblioteca nuevoLibro = new DatosBiblioteca(id, titulo, autor);

            listaLibros.add(nuevoLibro);

            System.out.println("Libro registrado: " + titulo);


            limpiarCampos();


            mostrarLibros();

        } catch (NumberFormatException e) {
            System.out.println("Error: El ID debe ser un número.");
        }
    }


    //logica para registrar




    //Logica para mostrar


}
