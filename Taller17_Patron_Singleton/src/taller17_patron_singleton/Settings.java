/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17_patron_singleton;

import java.util.HashMap;

/**
 *
 * @author jacob
 */
public class Settings {
    private static Settings instancia;
    private HashMap<String, String> configuracion;
    
    private Settings(){
        configuracion = new HashMap<>();
        configuracion.put("theme", "light");
        configuracion.put("language", "en");
    }
    
    public static Settings getInstancia(){
        if(instancia == null){
            instancia = new Settings();
        }
        return instancia;  
    }

    public HashMap<String, String> getConfiguracion() {
        return configuracion;
    }
}
