/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta4;

/**
 *
 * @author jacob
 */
public class Configuracion {
    private static Configuracion instancia;
    
    private String url;
    private String usuario;
    private String contrasenia;

    private Configuracion() {
        this.url = "url/que/se/utiliza/solo/una/vez";
        this.usuario = "Usuario 1";
        this.contrasenia = "Contrasenia1";
    }
    
    public static Configuracion getInstancia(){
        if(instancia == null){
            instancia = new Configuracion();
        }
        return instancia;
    }

    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }
    
}