/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Mario
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        while (true) {
            System.out.println("Dime un numero: ");
            numero = sc.nextInt();
            if (numero == 0 ){
                break;
            }
            if (numero % 2 == 0){
                System.out.println("El numero " + numero + " es par");
            }
            if (numero > 0 ){
                System.out.println("Es positivo");
            }
            int cuadradoNumero = numero * numero;
            System.out.println(cuadradoNumero);
        }
    }

}
