package com.trabajoentornos;

import java.util.ArrayList;
import java.util.List;

public class Cesta{
    private List<Libro> libros = new ArrayList<>();
   
    public List<Libro> getLibros (){
        return libros;
    }
    //Agregamos libro
    public void incluirLibro(Libro libro) {
        if (libro != null && !libros.contains (libro)) {
            libros. add (libro);
        }
    }
    //Eliminamos libro
    public void eliminarLibro (Libro libro) {
        if (libro != null) {
        libros.remove(libro);
        }
    }
}
