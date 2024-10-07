package taller11_grasp_altacohesion_bajoacoplamiento;

import java.util.ArrayList;
import java.util.List;
import taller11_grasp_altacohesion_bajoacoplamiento.Modelos.*;

public class Taller11_GRASP_AltaCohesion_BajoAcoplamiento {

    public static void main(String[] args) {
        
        //Simulacion de carrito
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(001, "papas", 12000));
        productos.add(new Producto(002, "Chocolate", 10000));
        
        Cliente cliente = new Cliente(24914823, "Jacobo Alfaro", "direccion 1");
        
        //Sistema de factura
        System.out.println("\n-----------SISTEMA DE FACTURACION----------- \n");

        FacturaServiceImpl facturaserviceImpl = new FacturaServiceImpl(new Factura("FACT_1", 0.5, productos));
        SistemaFactura sistemaFacturacion = new SistemaFactura(facturaserviceImpl);
        
        sistemaFacturacion.facturaService.procesarFactura(cliente);
        
        //Sistema de encapsulacion de DAO's de los modelos creados
        System.out.println("\n-----------SISTEMA DE DAO----------- \n");
        SistemaDAO sistemaDAO = new SistemaDAO(new ClienteDAOImpl(), new FacturaDAOImpl(), new ProductoDAOImpl());
        sistemaDAO.getClienteDAO().agregarCliente();
        sistemaDAO.getClienteDAO().buscarCliente();
        sistemaDAO.getFacturaDAO().eliminarFactura();
        sistemaDAO.getProductoDAO().actualizarProducto();
   
        
    }
    
}
