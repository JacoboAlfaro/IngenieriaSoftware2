/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_corte2.pregunta3;

/**
 *
 * @author jacob
 */
public class mainPregunta3 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("------------------- PREGUNTA 3 -------------------");
        
        IFacturaService servicio = new FacturaService();
        Cliente cliente1 = new Cliente();
        servicio.crearFacturaFisica(cliente1);
        servicio.crearFacturaElectronica(cliente1);
    }
}
