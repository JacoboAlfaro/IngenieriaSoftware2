/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofabricacionpura;

/**
 *
 * @author jacob
 */
public class Fabricante {
    public Mesa crearMesa(String numero){
        //LOGICA
        System.out.println("Mesa creado");
        return new Mesa(numero);
    }
    
    public Cocinero crearCocinero(String identificacion, String nombre, String turno){
        //LOGICA
        System.out.println("Cocinero creado");
        return new Cocinero(identificacion, nombre, turno);
    }
    
    public Camarero crearCamarero(String nombre, String identificacion){
        //LOGICA 
        System.out.println("Camarero creado");
        return new Camarero(nombre, identificacion);
    }
}
