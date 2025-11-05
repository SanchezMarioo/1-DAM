/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fraseAcertar,fraseEscribir;
        char letraAcertar = 0,letraEscribir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1: Dime la contraseña: ");
        fraseAcertar = sc.nextLine();
        System.out.println("Jugador 2: Dime la contraseña: ");
        fraseEscribir = sc.nextLine();
        for (int i = 0; i < fraseAcertar.length() ; i++) {
            letraAcertar = fraseAcertar.charAt(i);
            System.out.print("*");
            System.out.println(letraAcertar);
            
        }
    }

}
