/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_patroncommand;

/**
 *
 * @author jacob
 */
public class BombillaApagadoComando implements Comando{

    Bombilla bombilla;

    public BombillaApagadoComando(Bombilla bombilla) {
        this.bombilla = bombilla;
    }
    
    
    @Override
    public void ejecutar() {
        bombilla.apagar();
    }
    
}