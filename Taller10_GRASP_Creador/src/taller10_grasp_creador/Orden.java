/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_grasp_creador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jacob
 */
public class Orden {
    private List<Computadora> computadoras = new ArrayList<>();
    private IComputadoraFactory computadoraFactory;

    //Se inyecta la fabica en el constructor
    public Orden(IComputadoraFactory computadoraFactory) {
        this.computadoraFactory = computadoraFactory;
    }
    
    public void agregarComputadoraCarrito(String procesador, String tarjetaGrafica, int ram){
        Computadora computadora = computadoraFactory.crearComputadora(procesador, tarjetaGrafica, ram);
        computadoras.add(computadora);
        System.out.println("Computadora agregada correctamente");
    }
    
    public void listarOrden(){
        for(Computadora computadora: computadoras){
            System.out.println("--> Procesador: " + computadora.getProcesador() +
                               ", Tarjeta grafica: " + computadora.getTarjetaGrafica()+
                                ", Ram: " + computadora.getRam());
        }
    }
}
