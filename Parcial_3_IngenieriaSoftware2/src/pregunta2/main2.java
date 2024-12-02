/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta2;

/**
 *
 * @author jacob
 */
public class main2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PREGUNTA 2");
        Hamburguesa ham1 = new Builder()
                .setTipoCarne("Res")
                .setTipoPan("Integral")
                .setTipoQueso("Costenio")
                .setTipoRTomate("Cherry")
                .build();
        System.out.println("HamburgesaDatos= "
                + "Carne: " + ham1.getTipoCarne() +
                " Pan: " + ham1.getTipoPan()+
                " Queso: " + ham1.getTipoQueso()+
                " Tomate: " + ham1.getTipoRTomate());
    }   
}
