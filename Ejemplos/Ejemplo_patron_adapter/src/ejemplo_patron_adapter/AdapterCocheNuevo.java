/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patron_adapter;

/**
 *
 * @author jacob
 */
public class AdapterCocheNuevo implements IVehiculo{

    private CocheNuevo cocheNuevo;

    public AdapterCocheNuevo(CocheNuevo cocheNuevo) {
        this.cocheNuevo = cocheNuevo;
    }
    
    @Override
    public void acelerar() {
        cocheNuevo.iniciar();
    }

    @Override
    public void frenar() {
        cocheNuevo.detener();
    }
    
}
