/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta5;

/**
 *
 * @author jacob
 */
public class main5 {
    public static void main(String[] args) {
        System.out.println("PREGUNTA 5");
        Celular cel = new Celular();
        Computador comp = new Computador();
        
        Comando encenderComputador = new EncenderComputadorComando(comp);
        Comando encenderCelular = new EncenderCelularComando(cel);
        Comando reiniciarComputador = new ReiniciarComputadorComando(comp);
        Comando suspenderCelular = new SuspenderCelularComando(cel);
        
        encenderComputador.ejecutar();
        encenderCelular.ejecutar();
        reiniciarComputador.ejecutar();
        suspenderCelular.ejecutar();
        
    }
}
