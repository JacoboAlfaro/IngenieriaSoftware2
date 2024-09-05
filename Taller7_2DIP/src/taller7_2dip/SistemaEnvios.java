/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_2dip;

/**
 *
 * @author jacob
 */
public class SistemaEnvios {
    
    //Responsabilidad de encapsular los metodos de enviar orden de todas las implementaciones
    //En caso de agregar nuevas funcionalidades se debera crear ottra clase para cada empresa de envios
    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenDHL procesarOrdenDHL;
    private IProcesarOrdenUPS procesarOrdenUPS;

    public SistemaEnvios(IProcesarOrdenFedex procesarOrdenFedex, 
                        IProcesarOrdenDHL procesarOrdenDHL, 
                        IProcesarOrdenUPS procesarOrdenUPS) {
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenDHL = procesarOrdenDHL;
        this.procesarOrdenUPS = procesarOrdenUPS;
    }

    
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrdenFedex(orden);
    }
    
    public void enviarOrdenDHL(Orden orden){
        procesarOrdenDHL.enviarOrdenDHL(orden);
    }
    
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUPS.enviarOrdenUPS(orden);
    }
}
