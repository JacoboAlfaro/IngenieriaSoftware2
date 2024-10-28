/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller15_abstract_factory;

/**
 *
 * @author jacob
 */
public class FabricaClasica implements FabricaMuebles{

    @Override
    public Silla CrearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mueble CrearMesa() {
        return new MesaClasica();
    }
    
}
