/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofabricacionpura;

/**
 *
 * @author jacob
 */
public class Cocinero {
    private String identificacion;
    private String nombre;
    private String turno;

    public Cocinero(String identificacion, String nombre, String turno) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.turno = turno;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTurno() {
        return turno;
    }
    
    
}
