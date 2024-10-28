/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller15_abstract_factory;

/**
 *
 * @author jacob
 */
public class Taller15_Abstract_Factory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FabricaMuebles fabricaM = new FabricaModerna();
        FabricaMuebles fabricaC = new FabricaClasica();
        
        Silla sillaModerna = fabricaM.CrearSilla();
        Silla sillaClasica = fabricaC.CrearSilla();
        Mueble mesaModerna = fabricaM.CrearMesa();
        
        sillaModerna.Crear();
        sillaClasica.Crear();
        mesaModerna.Crear();
    }
    
}
