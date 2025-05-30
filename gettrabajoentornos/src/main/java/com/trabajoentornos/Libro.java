package com.trabajoentornos;
import java.util.List;

public class Libro {


    private String titulo;
    private String autor;
    private String isbn;
    private Double precio;
    private List<String> palabrasClave;


    public Libro(String titulo, String autor, String isbn, Double precio, List<String> palabrasClave) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.palabrasClave = palabrasClave;
    }


    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public String getIsbn() {
        return isbn;
    }


    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    public Double getPrecio() {
        return precio;
    }


    public void setPrecio(Double precio) {
        this.precio = precio;
    }


    public List<String> getPalabrasClave() {
        return palabrasClave;
    }


    public void setPalabrasClave(List<String> palabrasClave) {
        this.palabrasClave = palabrasClave;
    }
}

