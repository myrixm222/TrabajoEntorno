package com.trabajoentornos;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        // Creamos los libros
        Libro libro1 = new Libro(
            "El Quijote",
            "Miguel de Cervantes",
            "1234567890",
            10.0,
            Arrays.asList("clásico", "aventura")
        );


        Libro libro2 = new Libro(
            "Cien años de soledad",
            "Gabriel García Márquez",
            "0987654321",
            15.0,
            Arrays.asList("realismo", "novela")
        );


        // Creamos catalogo y agregamos libros
        Catalogo catalogo = new Catalogo();
        catalogo.altaLibro(libro1);
        catalogo.altaLibro(libro2);


        // Creamos usuario
        Usuario usuario = new Usuario("Juan Pérez", "juan.perez@gmail.com");


        // Buscamos libros por palabra clave
        System.out.println("Libros con la palabra clave 'aventura':");
        for (Libro libro : catalogo.buscarLibros("aventura")) {
            System.out.println("- " + libro.getTitulo());
        }


        // Agregamos los libro a la cesta del usuario
        usuario.getCesta().incluirLibro(libro1);


        // Mostramnos los libros en la cesta del usuario
        System.out.println("\nLibros en la cesta de " + usuario.getNombre() + ":");
        for (Libro libro : usuario.getCesta().getLibros()) {
            System.out.println("- " + libro.getTitulo());
        }
    }
}




