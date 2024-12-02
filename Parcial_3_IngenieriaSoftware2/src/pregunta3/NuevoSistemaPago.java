/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

/**
 *
 * @author jacob
 */
public class NuevoSistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public void crearSesion(){
        System.out.println("Creando sesion Nuevo Sistema Pago");
    }
    public void validarCorreo(){
        System.out.println("Validando correo Nuevo Sistema Pago");
    }
    public void validarAutorizacion(){
        System.out.println("Validando autorizacion Nuevo Sistema Pago");
    }
    public void realizarPago(){
        System.out.println("Realizando pago Nuevo Sistema Pago");
    }
}
