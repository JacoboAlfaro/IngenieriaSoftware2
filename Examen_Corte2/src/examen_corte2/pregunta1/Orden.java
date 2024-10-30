/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta1;

/**
 *
 * @author jacob
 */
public class Orden {
    public double calcularTotalPrecio(double precio, double descuento){
        //si no se aplica descuento se pasa como parametro descuento (0)
        if(descuento > 0){
            double descuentoPrecio = precio - descuento;
            double impuesto = descuentoPrecio * 0.1; //10% impuesto
            return descuentoPrecio + impuesto;
        } else{
            double impuesto = precio * 0.1;//10% impuesto
            return precio + impuesto;
        }
            
    }
}
