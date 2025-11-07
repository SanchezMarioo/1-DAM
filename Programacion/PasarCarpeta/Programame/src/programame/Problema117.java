/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programame;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Problema117 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = 0;
        String cadenaSoy, cadenaNombre;
        numeroCasos = sc.nextInt();
        for (int i = 0; i < numeroCasos; i++) {
            cadenaSoy = sc.next();
            cadenaNombre = sc.next();
            if (cadenaSoy.equals("Soy")){
                System.out.println("Hola, " + cadenaNombre + ".");
            }
        }
    }

}
