/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author jacob
 */
public class ReiniciarCelularComando implements Comando{
    Celular celular;

    public ReiniciarCelularComando(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.reinicar();
    }
    
    
}
