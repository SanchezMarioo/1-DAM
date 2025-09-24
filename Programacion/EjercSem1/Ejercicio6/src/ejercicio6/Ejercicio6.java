/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int notaPrimera;
        int notaSegunda;
        System.out.print("Cual es la primera nota: ");
        notaPrimera = input.nextInt();
        System.out.print("Cual es la segunda nota: ");
        notaSegunda = input.nextInt();
        int notaMedia;
        notaMedia = (notaPrimera + notaSegunda) / 2;
        System.out.println("Tu nota media es: " + notaMedia);
        
        
    }
    
}
