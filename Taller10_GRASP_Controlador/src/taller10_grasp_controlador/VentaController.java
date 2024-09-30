package taller10_grasp_controlador;

public class VentaController {
    public void comprarEntrada(Entrada entrada){
        if(verificarDisponibilidad(entrada)){
            entrada.setDisponible(false);
            System.out.println("Entrada comprada");
        }
    }
    
    public boolean verificarDisponibilidad(Entrada entrada){
        if(!entrada.isDisponible()){
            System.out.println("Entrada no disponible");
            return false;
        }else{
            return true;
        }
    }
}
