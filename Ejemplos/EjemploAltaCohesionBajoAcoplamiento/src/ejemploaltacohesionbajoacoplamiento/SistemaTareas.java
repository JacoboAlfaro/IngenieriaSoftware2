/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploaltacohesionbajoacoplamiento;

/**
 *
 * @author jacob
 */
public class SistemaTareas {
    private IServicioNotificaciones servicioNotificaciones;
    private ITareaDAO tareaDAO;

    public SistemaTareas(IServicioNotificaciones servicioNotificaciones, ITareaDAO tareaDAO) {
        this.servicioNotificaciones = servicioNotificaciones;
        this.tareaDAO = tareaDAO;
    }
    
    public IServicioNotificaciones getServicioNotificaciones(){
        return servicioNotificaciones;
    }
    
    public ITareaDAO getDAO(){
        return tareaDAO;
    }
}
