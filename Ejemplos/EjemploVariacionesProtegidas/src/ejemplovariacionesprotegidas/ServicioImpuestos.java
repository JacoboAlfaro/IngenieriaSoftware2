/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovariacionesprotegidas;

/**
 *
 * @author jacob
 */
public class ServicioImpuestos {
    ICalcularImpuestos calcularImpuesto;

    public ServicioImpuestos(ICalcularImpuestos calcularImpuesto) {
        this.calcularImpuesto = calcularImpuesto;
    }
    
    public void calcular(){
        this.calcularImpuesto.calcular();
    }
}
