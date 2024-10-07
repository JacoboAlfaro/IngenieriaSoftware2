/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesionbajoacoplamiento;

/**
 *
 * @author jacob
 */
public class TareaDAOImpl implements ITareaDAO{

    @Override
    public void insertar() {
        System.out.println("INSERTAR TAREA");
    }

    @Override
    public void leer() {
        System.out.println("OBTENIENDO TAREA");
    }
    
}
