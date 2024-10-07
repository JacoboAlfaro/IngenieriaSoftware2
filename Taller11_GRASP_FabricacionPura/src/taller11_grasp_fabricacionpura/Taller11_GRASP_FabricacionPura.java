/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11_grasp_fabricacionpura;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Taller11_GRASP_FabricacionPura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FabricaPedidos fabrica = new FabricaPedidos();
        List<Producto> productos = new ArrayList<>();
        Cliente cliente1 = fabrica.crearCliente("Jacobo", "direccion 1");
        
        //Crear prodcutos con fabrica
        Producto producto1 = fabrica.crearProducto("Papas deshijadas", 12000, 11);
        System.out.println("Nombre producto creado por fabrica: " + producto1.getNombre() + ", Precio: " + producto1.getPrecio());
        productos.add(producto1);
        
        //Crear pedido que internamente crea n numero de productos
        Pedido pedido = fabrica.crearPedido(4, 1, new Date(), cliente1, productos);
        
        for(Producto producto: pedido.getProductos()){
            System.out.println("Nombre: " + producto.getNombre() + ", Cantidad: " + producto.getCantidad() + ", Precio: $" + producto.getPrecio());
        }
        System.out.println("Cliente pedido: " + pedido.getCliente().getNombre());
    }
    
}
