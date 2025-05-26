package com.trabajoentornos;
public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;

    public Libro(String titulo, String autor, String isbn, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }

    public String getDatos() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn + ", Precio: $" + precio;
    }

    public String getTitulo() {
        return titulo;
    }
}
