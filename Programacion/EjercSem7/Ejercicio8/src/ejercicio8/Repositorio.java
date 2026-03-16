/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Repositorio<T> {

    private ArrayList<T> generico;

    public Repositorio() {
        generico = new ArrayList<>();
    }

    public void añadirProducto(T objeto) {
        generico.add(objeto);
    }

    public void eliminarProducto(T objeto) {
        generico.remove(objeto);
    }
    public void mostrarGenericos(){
        for (T t : generico) {
            System.out.println(t);
        }
    }
    public int numeroGenericos(){
        return generico.size();
    }

}
