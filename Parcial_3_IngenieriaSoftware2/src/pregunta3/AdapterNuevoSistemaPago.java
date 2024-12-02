/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

/**
 *
 * @author jacob
 */
public class AdapterNuevoSistemaPago implements ISistemaDePago {
    private NuevoSistemaPago sistemaPago;

    public AdapterNuevoSistemaPago(NuevoSistemaPago sistemaPago) {
        this.sistemaPago = sistemaPago;
    }

    @Override
    public void crearSesion() {
        sistemaPago.crearSesion();
    }

    @Override
    public void validarDatos(){
        sistemaPago.validarCorreo();
        sistemaPago.validarAutorizacion();
    }

    @Override
    public void realizarPago() {
        sistemaPago.realizarPago();
    }
    
    
}
