/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplospoo;

/**
 *
 * @author mario.sanper.2
 */
public class EjemplosPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo coche = new Vehiculo();
        // Metemos los atributos 
        coche.color="Verde";
        coche.marca="Audi";
        coche.matricula="2903XPZ";
        coche.velocidadMaxima(50);
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();

    }
    
}
