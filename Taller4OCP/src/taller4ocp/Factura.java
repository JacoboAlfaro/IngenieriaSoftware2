/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4ocp;

/**
 *
 * @author jacob
 */
public class Factura {
    public double calcularImpuesto(Calculo calculoImpuesto){
        return calculoImpuesto.calcularImpuesto();
    }
    
    /*
    Se crea la clase Factura, acuanto como servicio que calcular el impuesto del
    prodcuto, el emtodo calcularImouesto recibe todas las clases que extriendan 
    de la clase abstracta Calculo. Esto para no violar el principio OCP de SOLID 
    y permitiendo adición de nuevas clases pero no la modificacion de ya existentes.
    */
}
