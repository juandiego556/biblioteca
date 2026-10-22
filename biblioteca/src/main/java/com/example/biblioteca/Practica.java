package com.example.biblioteca;

public class Practica {
    public static void main(String[] args) {
        
        // 1. Crear tres objetos Libro con datos reales (uno antes del 2000 y otros después)
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        Libro libro2 = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        Libro libro3 = new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997);

        // 2. Imprimir el resumen() de cada uno
        System.out.println("--- Resúmenes ---");
        System.out.println(libro1.resumen());
        System.out.println(libro2.resumen());
        System.out.println(libro3.resumen());

        System.out.println("\n--- ¿Son antiguos? ---");
        // 3. Imprimir si cada libro esAntiguo()
        System.out.println(libro1.getTitulo() + " ¿Es antiguo? " + libro1.esAntiguo());
        System.out.println(libro2.getTitulo() + " ¿Es antiguo? " + libro2.esAntiguo());
        System.out.println(libro3.getTitulo() + " ¿Es antiguo? " + libro3.esAntiguo());

        // 4. Intentar escribir libro1.titulo = "Otro" fuera de la clase
        // Nota: Si descomentas la siguiente línea, verás el error de compilación porque el atributo es privado (encapsulamiento).
        // libro1.titulo = "Otro";
    }
}