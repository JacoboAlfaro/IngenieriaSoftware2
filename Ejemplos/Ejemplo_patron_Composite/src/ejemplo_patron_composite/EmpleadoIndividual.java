/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_composite;

/**
 *
 * @author jacob
 */

//CLASE LEAF
public class EmpleadoIndividual implements Empleado{
    private String nombre;
    private String puesto;

    public EmpleadoIndividual(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado:  " + nombre + " Cargo: " + puesto);
    }
    
    
}
