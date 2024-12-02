/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta3;

/**
 *
 * @author jacob
 */
public class main3 {
    public static void main(String[] args) {
        System.out.println("PREGUNTA 3");
        
        NuevoSistemaPago nuevoSis = new NuevoSistemaPago();
        AdapterNuevoSistemaPago adapter = new AdapterNuevoSistemaPago(nuevoSis);
        
        adapter.crearSesion();
        adapter.validarDatos();
        adapter.realizarPago();

    }
}
