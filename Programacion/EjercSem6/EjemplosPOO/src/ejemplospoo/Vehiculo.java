/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplospoo;

/**
 *
 * @author mario.sanper.2
 */
class Vehiculo {

    // Atributos de la clase 
    String marca;
    String color;
    String matricula;
    int valocidadMax;
    int velocidad = 0;
    int velocidadMax = 120;
    // Metodos
    void acelerar(){
        
        
        velocidad++;
        System.out.println("Acelerando......" + velocidad);
    }
    void cambiarColor(String nuevoColor){
        color = nuevoColor;
    }
    void velocidadMaxima (int velocidadMaximaNueva){
        if (velocidadMaximaNueva <= 140 && velocidadMaximaNueva >= 0){
            velocidadMax = velocidadMaximaNueva;
        }
    }
}
