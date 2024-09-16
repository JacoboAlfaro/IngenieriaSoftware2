/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ocp;

/**
 *
 * @author jacob
 */
public class DescuentoTemporal extends Descuento {
    private double valor;

    public DescuentoTemporal(double valor) {
        this.valor = valor;
    }

    public double getPorcentaje() {
        return valor;
    }

    @Override
    public double calcualarDescuento(Producto producto) {
        return producto.getPrecio() +  valor;
    }
    
    
    
}
