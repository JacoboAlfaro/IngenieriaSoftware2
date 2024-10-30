/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta4;

/**
 *
 * @author jacob
 */
public class Impuestos {
    ICalculadorImpuestos calc;

    public Impuestos(ICalculadorImpuestos calc) {
        this.calc = calc;
    }
    
    public void calcularImpuestos(double valor){
        this.calc.CalcularImpuesto(valor);
    }
}
