/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9yagni;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Biblioteca {
    private List<Libro> libros = new ArrayList<>();
    
    //Se unifica la fase 1 y 2 del metodo agregar libro
    public void agregarLibro(Libro libro){
        libro.setAnioPublicacion(2024);
        libros.add(libro);
        System.out.println("Libro " + libro.getTitulo() + " agregado a la lista");
    }
}
