/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo2_patron_adapter;

/**
 *
 * @author jacob
 */
public class AdapterSistemaPagoExterno implements ISistemaPagos {

    private SistemaPagoExterno sistemaPagoExprerno;

    public AdapterSistemaPagoExterno(SistemaPagoExterno sistemaPagoExprerno) {
        this.sistemaPagoExprerno = sistemaPagoExprerno;
    }
        
    @Override
    public void procesarPago() {
        sistemaPagoExprerno.AutorizarTransaccion();
        sistemaPagoExprerno.RealizarPago();
    }
    
}
