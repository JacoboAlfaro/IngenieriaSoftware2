
package taller5lsp;

import taller5lsp.Clases.Producto;
import taller5lsp.Clases.ProductoDigital;
import taller5lsp.Clases.ProductoFisico;
import taller5lsp.Clases.ProductoMixto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jacob
 */
public class Taller5LSP {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalcularCostoService calcularCostoService = new CalcularCostoService();
        
        //Intancia de productos
        Producto fisico = new ProductoFisico(10, "Producto fisico", 12.21, 2);
        Producto digital = new ProductoDigital(1232, "Producto digital", 122.21, 2);
        Producto mixto = new ProductoMixto(12, 2232, "Producto mixto", 212.23, 4);
        
        System.out.println("Precio producto fisico: " + calcularCostoService.calcularCostoService(fisico));
        System.out.println("Precio producto Digital: " + calcularCostoService.calcularCostoService(digital));
        System.out.println("Precio producto Mixto: " + calcularCostoService.calcularCostoService(mixto));
        
        //Envio de correos 
        ProductoFisico fisico2 = new ProductoFisico(1213, "Producto fisico 2", 1232.21, 3);
        fisico2.enviarPorCorreo();
        
        ProductoMixto mixto2 = new ProductoMixto(12234,324342, "Producto fisico 2", 1232.21, 3);
        mixto2.enviarPorCorreo();
    }
    
}
