/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("¿A que dia la semana estamos? (numero): ");
        int diaNum = sc.nextInt();
        
        Persona.establecerDia(diaNum);
        Persona p1 = new Persona();
        Persona p2 = new Persona();

        sc.nextLine();
        System.out.println("¿Cual es tu nombre? ");
        p1.nombre = sc.nextLine();

        System.out.println("¿Cual es tu nombre? ");
        p2.nombre = sc.nextLine();
        p1.saludo();
        p2.saludo();

    }

}
