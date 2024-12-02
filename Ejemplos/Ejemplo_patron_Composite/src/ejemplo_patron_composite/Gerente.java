/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */

//Clase composite
public class Gerente implements Empleado{
    
    private String nombre;
    private String puesto;
    private List<Empleado> subordiandos = new ArrayList<>();

    public Gerente(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }
    
    //agregar subordinado
    public void agregarSubordinado(Empleado empleado){
        subordiandos.add(empleado);
    }
    
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Empleado:  " + nombre + " Cargo: " + puesto);
        
        for(Empleado subordinado : subordiandos){
            subordinado.mostrarDetalles(); // delega la tarea a los subordinados
        }
    }
}
