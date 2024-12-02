/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patroncommand;

/**
 *
 * @author jacob
 */
public class VentiladorApagadoComando implements Comando{

    Ventilador ventilador;

    public VentiladorApagadoComando(Ventilador ventilador) {
        this.ventilador = ventilador;
    }
    
    
    @Override
    public void ejecutar() {
        ventilador.apagar();
    }
    
}
