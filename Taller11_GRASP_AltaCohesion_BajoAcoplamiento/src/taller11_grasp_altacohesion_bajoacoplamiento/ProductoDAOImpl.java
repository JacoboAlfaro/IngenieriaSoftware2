/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_altacohesion_bajoacoplamiento;

/**
 *
 * @author jacob
 */
public class ProductoDAOImpl implements IProductoDAO{
    @Override
    public void agregarProducto() {
        System.out.println("Agregando Producto.....");
    }

    @Override
    public void buscarProducto() {
        System.out.println("buscando Producto.....");    
    }

    @Override
    public void actualizarProducto() {
        System.out.println("Actualizando Producto.....");

    }

    @Override
    public void eliminarProducto() {
            System.out.println("Eliminando Producto.....");
    }
}
