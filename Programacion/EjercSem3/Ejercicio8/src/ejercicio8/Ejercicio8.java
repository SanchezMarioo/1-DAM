/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int eleccion = -1, suma = 0;
        int respClienteRendir;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        while (salir != true) {
            double numeroRandom;
            numeroRandom = (Math.random() * 100);
            int numeroRandomT = (int) numeroRandom;
            System.out.println("El numero random es: " + numeroRandomT);
            System.out.println("Quieres otro numero pulsa 1");
            System.out.println("Si quieres rendirte pulsa 0");
            eleccion = sc.nextInt();
            System.out.println("Elige una opcion:");
            suma += numeroRandomT;
            switch (eleccion) {
                case 0:
                    System.out.println("¿Cuál crees que es la suma de los números?");
                    respClienteRendir = sc.nextInt();
                    if (respClienteRendir == suma) {
                        System.out.println("Lo acertaste la suma es " + suma);
                    } else {
                        System.out.println("Lo siento fallaste" + suma);
                    }
                    salir = true;
                    break;
                default:
                    System.out.println("No has introducido el numero correcto");

            }
        }

    }
}
