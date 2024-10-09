/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploindireccion;

/**
 *
 * @author jacob
 */
public class Cliente {
    private String indentificacion;
    private String nombre;
    private String correo;

    public Cliente(String indentificacion, String nombre, String correo) {
        this.indentificacion = indentificacion;
        this.nombre = nombre;
        this.correo = correo;
    }

    public String getIndentificacion() {
        return indentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
    
    
}
