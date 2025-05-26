package com.trabajoentornos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

public class LibroTest {
    @Test
    public void testBuscarLibrosSinCoincidencias() {
        Catalogo catalogo = new Catalogo();
        List<Libro> resultados = catalogo.buscarLibros("Harry Potter");
        assertTrue(resultados.isEmpty());
    }

    @Test
    public void testRecopilarDatos() {
        Libro libro = new Libro("Test", "Autor", "0000", 1.99);
        Catalogo catalogo = new Catalogo();
        String datos = catalogo.recopilarDatos(libro);
        assertTrue(datos.contains("Título: Test"));
        assertTrue(datos.contains("Autor: Autor"));
    }
}
