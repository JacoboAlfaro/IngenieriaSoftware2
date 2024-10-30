/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package examen_corte2.pregunta1;

/**
 *
 * @author jacob
 */
public interface ILibreria {
    public void aniadirLibro(Libro libro);
    public void buscarLibroTitulo(String titulo);
    public void buscarLibroAutor(String autor);
    public void obtenerLibroPrecios(double precio1, double precio2);
    public void obtenerLibroAnio(int anio);
}
