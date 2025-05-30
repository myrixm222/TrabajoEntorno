package com.trabajoentornos;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CestaTest {


    private static final Libro LIBRO_1 = new Libro("El Quijote", "Miguel de Cervantes", "Literatura", 10.,
        List.of("clásico", "aventura"));
   


    private static final Libro LIBRO_2 = new Libro("Cien años de soledad", "Gabriel García Márquez", "Literatura", 15.,
        List.of("realismo", "novela"));


    @Test
    public void test_incluirLibro_libroNuevo() {
        Cesta cesta = new Cesta();
        cesta.incluirLibro(LIBRO_1);
        cesta.incluirLibro(LIBRO_2);
        assertEquals(2, cesta.getLibros().size());
    }


    @Test
    public void test_incluirLibro_libroRepetido() {
        Cesta cesta = new Cesta();
        cesta.incluirLibro(LIBRO_1);
        cesta.incluirLibro(LIBRO_1);
        assertEquals(1, cesta.getLibros().size());
    }


    @Test
    public void test_eliminarLibro_libroExistente() {
        Cesta cesta = new Cesta();
        cesta.incluirLibro(LIBRO_1);
        cesta.incluirLibro(LIBRO_2);
        cesta.eliminarLibro(LIBRO_1);
        assertEquals(1, cesta.getLibros().size());
    }


    @Test
    public void test_eliminarLibro_libroNoExistente() {
        Cesta cesta = new Cesta();
        cesta.incluirLibro(LIBRO_1);
        cesta.eliminarLibro(LIBRO_2);
        assertEquals(1, cesta.getLibros().size());
    }


}


