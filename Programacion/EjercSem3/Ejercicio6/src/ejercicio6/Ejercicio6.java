/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double numeroRandom = 0;
        numeroRandom =  Math.random() * 100;
        int numeroRandomT = (int) numeroRandom;
        System.out.println(numeroRandomT);
        while (true) {
            System.out.println("Dime un numero random: ");
            int numero = sc.nextInt();
            if (numero == -1){
                break;
            }
            if (numero < numeroRandomT){
                System.out.println("Es mayor");
            } else if (numero > numeroRandomT){
                System.out.println("Es menor");
            } else {
                System.out.println("Ese es el numero!");
                break;
            }
        }
    }

}
