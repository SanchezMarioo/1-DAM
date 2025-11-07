/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programame;

import java.util.Scanner;

/**
 *
 * @author MARIO
 */
public class Problema362 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numeroPedir,mes,dia = 0;
        
        numeroPedir = sc.nextInt();
        for (int i = 0; i < numeroPedir; i++) {
            dia = sc.nextInt();
            mes = sc.nextInt();
            
            if (dia == 25 && mes ==12){
                System.out.println("SI");
            } else{
                System.out.println("NO");
            }
        }
    }
}
