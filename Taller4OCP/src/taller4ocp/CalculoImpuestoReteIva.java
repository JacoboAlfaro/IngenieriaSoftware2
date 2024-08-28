/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ocp;

/**
 *
 * @author jacob
 */
public class CalculoImpuestoReteIva extends Calculo {

    private double impuestoReteIva; 

    public CalculoImpuestoReteIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
        this.impuestoReteIva = 0.1;
    }

    public void setImpuestoReteIva(double impuestoReteIva) {
        this.impuestoReteIva = impuestoReteIva;
    }
    
    @Override
    public double calcularImpuesto() {
        return super.getPrecio() * impuestoReteIva;
    }
    
    /*
    Clase CalculoImpuestoReteIva, extiende de calculo y se sobreescribe el metodo 
    CalcularImpuesto pero teniendo en cuenta el porcentaje propio del RETEIVA, además
    se crea una atributo impuestoReteIva incializado en 0.1, pero siendo posible cambiarlo
    con el metodo setImpuestoReteIva.
    */
    
}
