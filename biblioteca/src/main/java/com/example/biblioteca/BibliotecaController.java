package com.example.biblioteca;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BibliotecaController {

    // 1. Endpoint /libro: Devuelve un objeto Libro en formato JSON
    @GetMapping("/libro")
    public Libro obtenerLibro() {
        return new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
    }

    // 2. Endpoint /libros: Devuelve una lista con 3 objetos Libro
    @GetMapping("/libros")
    public List<Libro> obtenerLibros() {
        return List.of(
            new Libro("Cien años de soledad", "Gabriel García Márquez", 1967),
            new Libro("El principito", "Antoine de Saint-Exupéry", 1943),
            new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", 1997)
        );
    }

    // 3. Endpoint /libro/resumen: Devuelve el resumen() de un Libro como texto
    @GetMapping("/libro/resumen")
    public String obtenerResumen() {
        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967);
        return libro.resumen();
    }

    // 4. Endpoint /prestamo/{dias}: Calcula la multa o indica si está vigente
    @GetMapping("/prestamo/{dias}")
    public String calcularPrestamo(@PathVariable int dias) {
        if (dias <= 14) {
            return "Préstamo vigente";
        } else {
            int diasExtra = dias - 14;
            int multa = diasExtra * 500;
            return "Préstamo vencido. Multa: $" + multa;
        }
    }
}