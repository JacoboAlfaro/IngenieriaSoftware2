/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

/**
 *
 * @author jacob
 */
public class main1 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PREGUNTA 1");
        
        Fabrica fabricaExpress = new FabricaEnvioExpress();
        Fabrica fabricaRegular = new FabricaEnvioRegular();
        
        IEnvio envioExpress = fabricaExpress.crearEnvio();
        IEnvio envioRegular = fabricaRegular.crearEnvio();
        
        envioExpress.enviar();
        envioRegular.enviar();
    }
}
