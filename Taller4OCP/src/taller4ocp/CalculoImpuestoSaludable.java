/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ocp;

/**
 *
 * @author jacob
 */
public class CalculoImpuestoSaludable extends Calculo {
    
    private double impuestoSaludable;

    public CalculoImpuestoSaludable(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
        this.impuestoSaludable = 0.05;
    }

    public void setImpuestoSaludable(double impuestoSaludable) {
        this.impuestoSaludable = impuestoSaludable;
    }
   
    @Override
    public double calcularImpuesto() {
        return super.getPrecio() * impuestoSaludable;
    }
    
    /*
    Clase CalculoImpuestoSaludable, extiende de calculo y se sobreescribe el metodo 
    CalcularImpuesto pero teniendo en cuenta el porcentaje propio del Imouesto saludable ,
    además se crea una atributo impuestoSaludable incializado en 0.05, pero siendo posible cambiarlo
    con el metodo setImpuestoSaludable.
    */
}
