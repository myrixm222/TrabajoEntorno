package com.trabajoentornos;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.Test;

public class UsuarioTest {
    @Test
    public void testBuscarLibrosSinResultados() {
        Catalogo catalogo = new Catalogo();
        Usuario usuario = new Usuario("Ana", "ana@example.com", catalogo);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        usuario.buscarLibros("Libro que no existe");

        String salida = outContent.toString().trim();
        assertTrue(salida.contains("No se encontraron resultados."));

        System.setOut(System.out);
    }

    @Test
    public void testAgregarAlCarritoYRealizarPago() {
        Catalogo catalogo = new Catalogo();
        Usuario usuario = new Usuario("Pedro", "pedro@example.com", catalogo);

        List<Libro> libros = catalogo.buscarLibros("1984");

        usuario.agregarAlCarrito(libros);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        usuario.realizarPago("Efectivo");

        String salida = outContent.toString();
        assertTrue(salida.contains("Pago realizado con Efectivo"));
        assertTrue(salida.contains("Pedido realizado con éxito."));

        System.setOut(System.out);
    }
}
