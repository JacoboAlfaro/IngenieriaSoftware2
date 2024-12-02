/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplofacade2;

/**
 *
 * @author jacob
 */
public class Fachada {
    private SubsistemaCitas citas;
    private SubsistemaExamenes examenes;
    private SubsistemaMedicamentos medicamentos;
    
    public Fachada(){
        citas = new SubsistemaCitas();
        examenes = new SubsistemaExamenes();
        medicamentos = new SubsistemaMedicamentos();
    }
    
    public void tratamiento(){
        citas.asistirCita();
        examenes.asistirExamen();
        medicamentos.aplicarMedicamento();
    }
}
