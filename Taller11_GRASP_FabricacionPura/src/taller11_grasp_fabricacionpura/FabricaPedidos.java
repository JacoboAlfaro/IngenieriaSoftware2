/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_fabricacionpura;

import java.util.Date;
import java.util.List;

/**
 *
 * @author jacob
 */
public class FabricaPedidos {
    public Cliente crearCliente(String nombre, String direccion){
        //LOGICA
        System.out.println("Cliente creado");
        return new Cliente(nombre, direccion);
    }
    
    public Producto crearProducto(String nombre, double precio, int cantidad){
        //LOGICA
        System.out.println("Producto creado");
        return new Producto(nombre, precio, cantidad);
    }
    
    public Pedido crearPedido(int nProductos, int id, Date fecha, Cliente cliente, List<Producto> productos){
        //LOGICA 
        for(int i = 0; i < nProductos; i++){
            Producto producto = crearProducto("producto" + (i+1), 59500 + ((i+1) * 100), 12);
            productos.add(producto);
        }
        System.out.println("Pedido creado");
        return new Pedido(id, fecha, cliente, productos);
    }
}
