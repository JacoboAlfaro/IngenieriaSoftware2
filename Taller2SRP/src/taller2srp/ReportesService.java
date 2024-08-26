/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller2srp;

import java.util.ArrayList;
import taller2srp.Clases.Factura;

/**
 *
 * @author jacob
 */
public class ReportesService {
    
    public void generarReporteFacturas(ArrayList<Factura> facturas){
        System.out.println("----------- Reporte de las facturas -----------");
        System.out.println("Facturas del mes:");
        
        double subTotal = 0;
        for(int i = 0; i < facturas.size(); i++){
            Factura factura = facturas.get(i);
            System.out.println("-> Codigo = " + factura.getCodigo() +
                    ", Producto = " + factura.getProducto() +
                    ", Valor Total = " + factura.getValorTotal());
            subTotal = subTotal + factura.getValorTotal();
        }
        System.out.println("Valor total de todas las facturas: " + subTotal);
    }
    
    /*
    Se separa el generar reporte de facturas del mes de la clase Factura ya que esta informacion 
    de informes no es propia de la clase, por lo tanto no deberia  haber un metodo generarReporte dentro de Usuario.  
    para ello se crea una clase ReportesService encargada unicamente de los
    metodos para generar reportes y temas afines a contabilidad y estadisticas.
    */
}
