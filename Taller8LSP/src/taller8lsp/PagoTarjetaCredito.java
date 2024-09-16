/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8lsp;

/**
 *
 * @author jacob
 */
public class PagoTarjetaCredito extends Pago{
    private String numeroTarjeta;
    private String fechaVencimineto;
    private String cvv;

    @Override
    public void procesarPago() {
        System.out.println("Procesar pago por Trajeta de credito");
    }
    
    
}
