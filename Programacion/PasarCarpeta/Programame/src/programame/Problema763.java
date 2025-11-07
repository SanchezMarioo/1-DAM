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
public class Problema763 {

    public static void main(String[] args) {
        int numeroPedir;
        String inputUsuario;
        Scanner sc = new Scanner (System.in);
        
        numeroPedir = sc.nextInt();
        
        for (int i = 0; i < numeroPedir; i++) {
            inputUsuario = sc.next();
            if(inputUsuario.equalsIgnoreCase("colgadas")){
                System.out.println("Bien");
            } else{
                System.out.println("Mal");
            }
        }
    }
}
