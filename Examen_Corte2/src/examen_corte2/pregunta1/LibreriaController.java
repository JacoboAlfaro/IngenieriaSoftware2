/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta1;

/**
 *
 * @author jacob
 */
public class LibreriaController {
    ILibreria _libreria;

    public LibreriaController(ILibreria libreria) {
        this._libreria = libreria;
    }
    
    public void aniadirLibro(Libro libro){
        this._libreria.aniadirLibro(libro);
    }
    
    public void buscarLibroTitulo(String titulo){
        this._libreria.buscarLibroTitulo(titulo);
    }
    
    public void buscarLibroAutor(String autor){
        this._libreria.buscarLibroAutor(autor);
    }
    
    public void obtenerLibroPrecios(double precio1, double precio2){
        this._libreria.obtenerLibroPrecios(precio1, precio2);
    }
    
    public void obtenerLibroAnio(int anio){
        this._libreria.obtenerLibroAnio(anio);
    }
}
