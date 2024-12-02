/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta1;

/**
 *
 * @author jacob
 */
public class FabricaEnvioExpress implements Fabrica{

    @Override
    public IEnvio crearEnvio() {
        return new EnvioExpress();
    }
    
}
