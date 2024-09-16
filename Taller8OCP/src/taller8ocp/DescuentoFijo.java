/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ocp;

/**
 *
 * @author jacob
 */
public class DescuentoFijo extends Descuento {

    private double valor;

    public DescuentoFijo(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
    
    @Override
    public double calcualarDescuento(Producto producto) {
        return producto.getPrecio() + (producto.getPrecio() * valor);
    }
    
}
