package com.trabajoentornos;
import java.util.ArrayList;
import java.util.List;


public class Catalogo {


    private List<Libro> librosDisponibles = new ArrayList<>();


    public List<Libro> getLibrosDisponibles() {
        return librosDisponibles;
    }
    //Damos de alta un libro
    public void altaLibro(Libro libro) {
        if (libro != null && !librosDisponibles.contains(libro)) {
            librosDisponibles.add(libro);
        }
    }
    //Buscamos libros por palabra clave
    public List<Libro> buscarLibros(String palabraClave) {
        List<Libro> librosEncontrados = new ArrayList<>();
        for (Libro libro : librosDisponibles) {
            if (libro.getPalabrasClave().contains(palabraClave)) {
                librosEncontrados.add(libro);
            }
        }
        return librosEncontrados;
    }
}


