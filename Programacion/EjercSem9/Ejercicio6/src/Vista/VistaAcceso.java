/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class VistaAcceso {

    private Scanner sc;

    public VistaAcceso() {
        sc = new Scanner(System.in);
    }
    
    public int pedirOpcion() {
        System.out.println("1. Registrar un nuevo intento de acceso");
        System.out.println("2. Mostrar todos los accesos registrados");
        System.out.println("3. Mostrar únicamente los accesos válidos");
        System.out.println("4. Mostrar únicamente los accesos no válidos");
        System.out.println("5. Mostrar cuántos intentos de acceso ha realizado un usuario concreto");
        System.out.println("6. Salir del programa");
        System.out.println("Elige una opcion: ");
        while(!sc.hasNextInt()){
            System.out.println("Introduce un numero");
            sc.nextLine();
            System.out.println("Elige una opcion: ");
        }
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }
    public String pedirMensaje(String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
