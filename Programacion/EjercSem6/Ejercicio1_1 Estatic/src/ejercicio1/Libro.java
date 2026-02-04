/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author mario.sanper.2
 */
public class Libro {

    static int id = 0; // Es compatible por TODOS los objetos de la clase 
    String titulo;
    String autor;
    int añoPub;
    int numPaginas;

    public Libro() {
        // Responsable de asignar el id
        id++;
    }

    void mostrarInformacion() {

        System.out.println("====================================");
        System.out.println("? INFORMACION DEL LIBRO");
        System.out.println("====================================");
        System.out.println("ID: " + id);
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + añoPub);
        System.out.println("Páginas: " + numPaginas);
        System.out.println("Ultima fecha:  " + Datos.mostrarUltimaFecha());
    }
}
