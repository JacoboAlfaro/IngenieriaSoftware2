
package taller4ocp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jacob
 */
public class Taller4OCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        Cada explicacion de la separacion del codigo se encuentra dentro de cada clase.
        */
        
        Calculo impuestoIva = new CalculoImpuestoIva("Producto 1", 4, 12500);
        Calculo impuestoReteIva = new CalculoImpuestoReteIva("Producto 2", 2, 12500);
        Calculo impuestoSaludable = new CalculoImpuestoSaludable("Producto 3", 6, 12500);
    
        Factura factura = new Factura();
        
        //Impuesto IVA
        double iva = factura.calcularImpuesto(impuestoIva);
        System.out.println("Impuesto IVA: " + iva + ", ValorProdcuto mas IVA: " + (impuestoIva.getPrecio() + iva));
        
        //Impuesto RETEIVA
        double reteIva = factura.calcularImpuesto(impuestoReteIva);
        System.out.println("Impuesto RETEIVA: " + reteIva + ", ValorProdcuto mas RETEIVA: " + (impuestoReteIva.getPrecio() + reteIva));
        
        //IMPUESTO SALUDABLE
        double saludable = factura.calcularImpuesto(impuestoSaludable);
        System.out.println("Impuesto SALUDABLE: " + saludable + ", ValorProdcuto mas SALUDABLE: " + (impuestoSaludable.getPrecio() + saludable));
    }
    
}
