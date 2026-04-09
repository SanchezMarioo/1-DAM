/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author mario.sanper.2
 */
public class Mision {
    private String nombre;
    private int duracionEstimada;
    private int presupuestoAsignado;

    public Mision(String nombre, int duracionEstimada, int presupuestoAsignado) {
        this.nombre = nombre;
        this.duracionEstimada = duracionEstimada;
        this.presupuestoAsignado = presupuestoAsignado;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre );
        System.out.println("Duracion estimada" + duracionEstimada);
        System.out.println("Presupuesto asignado " + presupuestoAsignado );
    }
}
