/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_grasp_polimorfismo;

/**
 *
 * @author jacob
 */
public class Garaje implements IGaraje{
    
    @Override
    public void estacionar (ITransporte transporte){
        System.out.println("Estacionando transporte " + transporte.getClass().getSimpleName());
    }
}
