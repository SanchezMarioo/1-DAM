/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0, contadorEdad = 0;
        int sumaEdad = 0;
        float media = 0 ;
        while (true) {
            System.out.println("Dime la edad:");
            numero = sc.nextInt();
            if (numero <= -1) {
                break;
            }
            contador++;

            sumaEdad += numero;
            media = sumaEdad / contador;
            if (numero >= 18){
                contadorEdad++;
            }

        }
        System.out.println("La media de edad de alumnos es: " + media + " la suma de los alumnos es: " + sumaEdad + " y los alumnos >= 18 son: " + contadorEdad  );
    }

}
