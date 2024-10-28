/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller16_patron_builder;

import java.util.Set;

/**
 *
 * @author jacob
 */
public class Usuario {
    private String nombre;
    private int edad;
    private String correo;
    private Set<String> interes;

    public Usuario(Builder builder) {
        this.nombre = builder.nombre;
        this.edad = builder.edad;
        this.correo = builder.correo;
        this.interes = builder.interes;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+ nombre + " - Edad: " + edad + " - Correo: " + correo;
    }
}
