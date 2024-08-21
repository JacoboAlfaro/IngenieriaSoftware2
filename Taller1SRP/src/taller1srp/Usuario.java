/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller1srp;

/**
 *
 * @author jacob
 */
public class Usuario {
    private String nombre;
    private String correo;
    private String contrasenia;

    public Usuario(String nombre, String correo, String contrasenia) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasenia = contrasenia;
    } 

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
    /*
    De la clase Usuario se eliminan los metodos de obtener informacion de usuario,
    enviar correos electronicos, validar contraseñas y calcular el salario.
    Esto debido a que viola el principio SRP de SOLID dandole mas de una resposabilidad  a la clase Usuario,
    convirtiendose en un conjunto de metodos que tienen diferentes funciones diferentes dentor de una misma clase. 
    */
}


