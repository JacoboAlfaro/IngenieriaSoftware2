/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patron_adapter;

/**
 *
 * @author jacob
 */
public class Ejemplo_patron_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //SIMULACION CLIENTE
        CocheNuevo coche = new CocheNuevo();
        IVehiculo vehiculo = new AdapterCocheNuevo(coche);
        
        vehiculo.acelerar();
        vehiculo.frenar();
    }
    
}
