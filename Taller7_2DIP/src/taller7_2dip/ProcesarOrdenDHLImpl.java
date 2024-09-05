/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7_2dip;

/**
 *
 * @author jacob
 */
public class ProcesarOrdenDHLImpl implements IProcesarOrdenDHL{
    
    @Override
    public void enviarOrdenDHL(Orden Orden) {
        System.out.println(Orden.getFecha());
        System.out.println(Orden.getLugarOrigen());
        System.out.println(Orden.getLugarDestino());
        System.out.println("CON DHL");
    }
}
