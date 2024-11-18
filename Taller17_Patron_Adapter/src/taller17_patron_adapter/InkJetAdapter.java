/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller17_patron_adapter;

/**
 *
 * @author jacob
 */
public class InkJetAdapter implements Impresora{
    ImpresoraInkJet impresoraInkJet;
    
    public InkJetAdapter(ImpresoraInkJet impresoraInkJet) {
        this.impresoraInkJet = impresoraInkJet;
    }

    @Override
    public void imprimir() {
        impresoraInkJet.imprimirConTinta();
    }
}
