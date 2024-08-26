/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp.DAOs;

import taller2srp.Clases.Factura;

/**
 *
 * @author jacob
 */
public class FacturaDAO {
    
    public void guardarFactura(Factura factura){
        System.out.println("Factura con codigo " + factura.getCodigo() + " guardada correctamente en la BD");
    }
    
    /*
    Se separa el guardar factura de la clase Factura ya que esta clase no debería
    encargarse de la gestion de estos mismos, para ello se crea una clase 
    FacturaDAO encargada unicamente de la gestión de facturas
    */
}
