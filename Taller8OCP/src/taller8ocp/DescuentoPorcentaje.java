/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ocp;

/**
 *
 * @author jacob
 */
public class DescuentoPorcentaje extends Descuento{
    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    @Override
    public double calcualarDescuento(Producto producto) {
        return producto.getPrecio() + (producto.getPrecio() * porcentaje);
    }
    
}
