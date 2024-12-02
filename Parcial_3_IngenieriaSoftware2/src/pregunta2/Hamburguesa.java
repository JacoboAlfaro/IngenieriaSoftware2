/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pregunta2;

/**
 *
 * @author jacob
 */
public class Hamburguesa {
    private String tipoRTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;
    
    public Hamburguesa(Builder builder){
        this.tipoRTomate = builder.tipoTomate;
        this.tipoPan = builder.tipoPan;
        this.tipoQueso = builder.tipoQueso;
        this.tipoCarne = builder.tipoCarne;
    }

    public String getTipoRTomate() {
        return tipoRTomate;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public String getTipoPan() {
        return tipoPan;
    }
}
