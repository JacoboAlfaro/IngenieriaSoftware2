/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_patroncommand;

/**
 *
 * @author jacob
 */
public class Ejemplo_PatronCommand {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bombilla b = new Bombilla();
        Ventilador v = new Ventilador();
        
        Comando apagarBombilla = new BombillaApagadoComando(b);
        Comando encenderBombilla = new BombillaEncendidoComando(b);
        ControlRemoto control = new ControlRemoto(apagarBombilla);
        ControlRemoto contro2 = new ControlRemoto(encenderBombilla);
        control.ejecutar();
        contro2.ejecutar();
    }
    
}
