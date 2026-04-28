/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {

    private Scanner sc;
    private ValidadorIP validador;
    private String ip;

    public Gestor() {
        sc = new Scanner(System.in);
        validador = new ValidadorIP();
    }

    public void init() {
        do {
            System.out.println("Introduce la IP (o salir)");
            ip = sc.nextLine();
            if (ip.equalsIgnoreCase("salir")) {
                break;
            }
            try {
                if (validador.esValida(ip)) {
                    System.out.println("Es valida la IP");
                } else {
                    throw new ExceptionInvalidIP();
                }
            } catch (ExceptionInvalidIP e ) {
                System.err.println(e);
            }
        } while (true);
    }

}
