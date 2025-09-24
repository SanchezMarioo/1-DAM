/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        float radio;
        final float PI;
        float longitud;
        float area;
        PI = 3.14f;
        System.out.print("Cual es el radio de la circunferencia: ");
        radio = input.nextFloat();
        longitud = (2*PI)*radio;
        area= PI*(radio*radio);
        System.out.println("La longitud es: " + longitud);
        System.out.println("El area es: " + area);
        
        
        
    }
    
}
