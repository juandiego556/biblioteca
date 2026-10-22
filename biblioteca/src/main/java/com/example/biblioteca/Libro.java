package com.example.biblioteca;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    // Constructor
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    // Getter para el título
    public String getTitulo() {
        return this.titulo;
    }

    // Método para saber si es antiguo
    public boolean esAntiguo() {
        return this.anio < 2000;
    }

    // Método resumen
    public String resumen() {
        return "Título: " + this.titulo + " | Autor: " + this.autor + " | Año: " + this.anio;
    }
}