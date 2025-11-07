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
public class Problema621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numeroCasos = 0, pagina = 0;
        numeroCasos = sc.nextInt();
        for (int i = 0; i < numeroCasos; i++) {
            pagina = sc.nextInt();
            if (pagina % 2 == 0 ){
                System.out.println(pagina + 1);
            } else{
                System.out.println(pagina - 1);
            }
        }
    }
}
