/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_grasp_controlador;

/**
 *
 * @author jacob
 */
public class UsuarioCompra {
    private VentaController controlador = new VentaController();
    
    public void comprar (Entrada entrada){
        controlador.comprarEntrada(entrada);
    }
}
