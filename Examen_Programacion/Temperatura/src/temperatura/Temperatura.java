/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperatura;

import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float temperatura, temperaturaMaxima = -1, temperaturaMaximaF = -1; // el menor posible
        int contador = 0,contadorDias = 0;
        do {
            System.out.println("Introduce la temperatura: ");
            temperatura = sc.nextInt();
            if (temperatura > temperaturaMaxima) {
                temperaturaMaxima = temperatura;
            }
            if (temperatura > 30){
                contadorDias++;
            }
            temperaturaMaximaF = (temperaturaMaxima * 9/5) + 32;

            contador++;
        } while (contador < 7);

        System.out.println("La temperatura maxima introducida es: " + temperaturaMaximaF + " " + contadorDias);
    }
}
