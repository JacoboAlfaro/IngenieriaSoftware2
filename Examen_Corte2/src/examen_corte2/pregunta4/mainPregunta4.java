/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta4;

/**
 *
 * @author jacob
 */
public class mainPregunta4 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------- PREGUNTA 4 -------------------");
        
        Impuestos impuestosColombia = new Impuestos(new ImpuestoColombiaImpl());
        Impuestos impuestosEEUU = new Impuestos(new ImpuestoEEUUImpl());
        Impuestos impuestosFrancia = new Impuestos(new ImpuestoFranciaImpl());
        
        impuestosColombia.calcularImpuestos(12);
        impuestosEEUU.calcularImpuestos(12);
        impuestosFrancia.calcularImpuestos(12);
        
    }
}
