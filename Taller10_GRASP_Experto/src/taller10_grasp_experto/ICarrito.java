/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller10_grasp_experto;

/**
 *
 * @author jacob
 */
public interface ICarrito {
    public void agregarLibroCarrito(Libro libro);
    public void eliminarLibroCarrito(int pos);
    public void calcularPrecioTotal();
}
