/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Libreria implements ILibreria{
    
    List<Libro> libros = new ArrayList<>();
    
    @Override
    public void aniadirLibro(Libro libro){
        libros.add(libro);
        System.out.println("Libro añadido a la lista");
    }
    
    @Override
    public void buscarLibroTitulo(String titulo){
        System.out.println("Buscando libro en la lista con titulo: " + titulo);
    } 
    
    @Override
    public void buscarLibroAutor(String autor){
        System.out.println("Buscando libro en la lista con titulo: " + autor);
    }
    
    @Override
    public void obtenerLibroPrecios(double precio1, double precio2){
        System.out.println("Buscando libros en la lista con precios entre: " + precio1 + " y " + precio2);
    }
    
    @Override
    public void obtenerLibroAnio(int anio){
        System.out.println("Buscando libro en la lista con año de publicacion: " + anio);
    }
    
}
