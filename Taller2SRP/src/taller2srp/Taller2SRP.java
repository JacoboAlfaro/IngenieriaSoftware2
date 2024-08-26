/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package taller2srp;

import java.util.ArrayList;
import taller2srp.Clases.Cliente;
import taller2srp.Clases.Factura;
import taller2srp.DAOs.ClienteDAO;
import taller2srp.DAOs.FacturaDAO;

/**
 *
 * @author jacob
 */
public class Taller2SRP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        Cada explicacion de la separacion del codigo se encuentra dentro de cada clase.
        */
        
        //Creacion de clientes y guardado en la BD
        Cliente cliente1 = new Cliente("Jacobo", "12345678");
        Cliente cliente2 = new Cliente("Pablo", "AB31432");
        
        ClienteDAO clienteDao = new ClienteDAO();
        clienteDao.guardarCliente(cliente1);
        clienteDao.guardarCliente(cliente2);
        
        //Creacion de facturas y guardado en la BD
        Factura factura1 = new Factura("codigo 1", "Papas", 3, 12.54);
        Factura factura2 = new Factura("codigo 2", "Cebolla", 1, 5.12);
        Factura factura3 = new Factura("codigo 3", "Arroz", 4, 43.64);
        Factura factura4 = new Factura("codigo 4", "Mandarinas", 12, 22.22);
        Factura factura5 = new Factura("codigo 5", "Cerveza", 1, 135.69);
        
        FacturaDAO facturaDao = new FacturaDAO();
        facturaDao.guardarFactura(factura1);
        facturaDao.guardarFactura(factura2);

        //Lista de facturas
        ArrayList<Factura> facturas = new ArrayList<>();
        facturas.add(factura1);
        facturas.add(factura2);
        facturas.add(factura3);
        facturas.add(factura4);
        facturas.add(factura5);
        
        //Generar reporte de facturas
        ReportesService reportesService = new ReportesService();
        
        reportesService.generarReporteFacturas(facturas);
        
        //Enviar correo de factura a cliente y a la DIAN
        NotificacionesService notificacionesService = new NotificacionesService();
        
        notificacionesService.enviarEmailFactura("Correo.cliente1@test.com", factura4);
        notificacionesService.enviarEmailFactura("Correo.cliente2@test.com", factura5);
        
        notificacionesService.enviarFacturaDian(factura3);
        notificacionesService.enviarFacturaDian(factura2);
        
    }
    
}
