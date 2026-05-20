/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaConsola {

    private Scanner sc;

    public VistaConsola() {
        sc = new Scanner(System.in);
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }

    public String pedirMsg(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public void mostrarCorreos(ArrayList<String> listaCorreos) {
        System.out.println(listaCorreos.size());
        if (listaCorreos == null || listaCorreos.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (String correos : listaCorreos) {
                System.out.println(correos);
            }
        }
    }
}
