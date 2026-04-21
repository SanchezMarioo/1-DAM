/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author mario.sanper.2
 */
public class LibroEscolar extends Tienda {

    private String curso;
    private String asignatura;

    public LibroEscolar(String curso, String nombre, double precioBase) {
        super(nombre, precioBase);
        this.curso = curso;
    }

    public LibroEscolar( String nombre, double precioBase,String asignatura) {
        super(nombre, precioBase);
        this.asignatura = asignatura;
    }
    

}
