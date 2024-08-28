/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ocp;

/**
 *
 * @author jacob
 */
public class CalculoImpuestoIva extends Calculo {
    
    private double impuestoIva; 

    public CalculoImpuestoIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
        this.impuestoIva = 0.19;
    }

    public void setImpuestoIva(double impuestoIva) {
        this.impuestoIva = impuestoIva;
    }
    
    @Override
    public double calcularImpuesto() {
        return super.getPrecio() * impuestoIva;
    }
    
    /*
    CLase CalculoImpuestoIva, extiende de calculo y se sobreescribe el metodo 
    CalcularImpuesto pero teniendo en cuenta el porcentaje propio del IVA,además
    se crea una atributo impuestoIva incializado en 0.19, pero siendo posible cambiarlo
    con el metodo setImouestoIva.
    */
}
