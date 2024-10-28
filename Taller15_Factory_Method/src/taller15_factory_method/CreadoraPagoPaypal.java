/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_factory_method;

/**
 *
 * @author jacob
 */
public class CreadoraPagoPaypal extends Creadora{

    @Override
    public MetodoPago crear(double saldo) {
        return new PagoPaypal(saldo);
    }
    
}
