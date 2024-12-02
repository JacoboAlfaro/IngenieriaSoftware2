/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author jacob
 */
public class ReiniciarComputadorComando implements Comando{
    Computador computador;

    public ReiniciarComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.reinicar();
    }
    
}
