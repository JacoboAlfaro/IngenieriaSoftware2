/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_factory_method;

/**
 *
 * @author jacob
 */
public class PagoPaypal implements MetodoPago{
    private double saldo;
    
    public PagoPaypal(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    @Override
    public void procesarPago(double cantidad) {
        if(cantidad < saldo && cantidad >= 0){
            this.saldo = this.saldo - cantidad;
        }
        System.out.println("Saldo restante: " + saldo);
    }
    
}
