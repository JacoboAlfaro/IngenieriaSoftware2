/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author jacob
 */
public class EncenderComputadorComando implements Comando{
    Computador computador;

    public EncenderComputadorComando(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.encender();
    }
    
    
}
