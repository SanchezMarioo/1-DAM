/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author Mario
 */
public class Documento {
    private int id;
    private String titulo;
    private int numPaginas;

    public Documento(int id, String titulo, int numPaginas) {
        this.id = id;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "id=" + id + ", titulo=" + titulo + ", numPaginas=" + numPaginas;
    }
    
}
