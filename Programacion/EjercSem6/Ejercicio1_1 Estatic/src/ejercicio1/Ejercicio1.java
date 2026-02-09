/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author mario.sanper.2
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        Libro libro2 = new Libro();
        
        System.out.println("Introduce los datos de libro");
        System.out.println("Titulo: ");
        libro.titulo = sc.nextLine();
        System.out.println("Autor: ");
        libro.autor = sc.nextLine();
        System.out.println("Año: ");
        libro.añoPub = sc.nextInt();
        System.out.println("Páginas: ");
        libro.numPaginas = sc.nextInt();
        sc.nextLine();
        // Segundo libro 
        System.out.println("Introduce los datos del segundo libro");
        System.out.println("Titulo: ");
        libro2.titulo = sc.nextLine();
        System.out.println("Autor: ");
        libro2.autor = sc.nextLine();
        System.out.println("Año: ");
        libro2.añoPub = sc.nextInt();
        System.out.println("Páginas: ");
        libro2.numPaginas = sc.nextInt();
        libro.mostrarInformacion();
        libro2.mostrarInformacion();
        sc.close();
    }
}
