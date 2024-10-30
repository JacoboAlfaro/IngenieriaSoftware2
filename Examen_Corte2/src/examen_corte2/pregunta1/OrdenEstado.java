/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta1;

/**
 *
 * @author jacob
 */
public class OrdenEstado {
    public String obtenerEstado(int ordenId){
        if(ordenId >= 100 ){
            return "Aceptado";
        }
        if(ordenId > 50 && ordenId < 100){
            return "En progreso";
        }
        if(ordenId == 0 || ordenId >= 1 ){
            return "pendiente";
        }
        
        //solo llegan aqui los menores a 0
        return "Orden no valida";
        

    }
}
