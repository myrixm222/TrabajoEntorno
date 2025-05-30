package com.trabajoentornos;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CatalogoTest {


    private static final Libro LIBRO_1 = new Libro(
        "El Quijote",
        "Miguel de Cervantes",
        "Literatura",
        10.0,
        List.of("antiguo", "aventura"));


    private static final Libro LIBRO_2 = new Libro(
        "Cien años de soledad",
        "Gabriel García Márquez",
        "literatura",
        15.0,
        List.of("realismo", "antiguo"));


    @Test
    public void test_altaLibro_libroNuevo() {
        Catalogo catalogo = new Catalogo();
        catalogo.altaLibro(LIBRO_1);
        catalogo.altaLibro(LIBRO_2);
        assertEquals(2, catalogo.getLibrosDisponibles().size());
    }


    @Test
    public void test_altaLibro_libroRepetido() {
        Catalogo catalogo = new Catalogo();
        catalogo.altaLibro(LIBRO_1);
        catalogo.altaLibro(LIBRO_1);
        assertEquals(1, catalogo.getLibrosDisponibles().size());
    }


    @Test
    public void test_buscarLibros_conPalabraClave() {
        Catalogo catalogo = new Catalogo();
        catalogo.altaLibro(LIBRO_1);
        catalogo.altaLibro(LIBRO_2);


        List<Libro> encontrados = catalogo.buscarLibros("aventura");
        assertEquals(1, encontrados.size());
        assertTrue(encontrados.contains(LIBRO_1));


        encontrados = catalogo.buscarLibros("realismo");
        assertEquals(1, encontrados.size());
        assertTrue(encontrados.contains(LIBRO_2));


        encontrados = catalogo.buscarLibros("antiguo");
        assertEquals(2, encontrados.size());
        assertTrue(encontrados.contains(LIBRO_1));
        assertTrue(encontrados.contains(LIBRO_2));
    }


    @Test
    public void test_buscarLibros_noHayPalabraClave() {
        Catalogo catalogo = new Catalogo();
        catalogo.altaLibro(LIBRO_1);
        catalogo.altaLibro(LIBRO_2);


        List<Libro> encontrados = catalogo.buscarLibros("juvenil");
        assertEquals(0, encontrados.size());
    }
 
}


