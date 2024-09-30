/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_grasp_experto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Carrito implements ICarrito{
    private List<Libro> libros = new ArrayList<>();
    
    @Override
    public void agregarLibroCarrito(Libro libro){
        libros.add(libro);
        System.out.println("libro " + libro.getTitulo() + " agregado al carrito");
    }
    
    @Override
    public void eliminarLibroCarrito(int pos){
        if(!libros.isEmpty()){
            if(pos <= 0 || pos > libros.size()){
                System.out.println("Posicion no valida");
            }else{
                libros.remove(pos - 1);
                System.out.println("Libro en la posicion " + pos + " eliminado correctamente");
            }
        } else{
            System.out.println("Carrito vacio");
        }
        
    }
    
    @Override
    public void calcularPrecioTotal(){
        double sumaTotal = 0;
        for(Libro libro : libros){
            sumaTotal += libro.getPrecio();
        }
        System.out.println("SUma total: " + sumaTotal);
    }
}
