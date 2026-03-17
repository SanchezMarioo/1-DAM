/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class Pila<T> {

    ArrayList<T> elementos;

    public Pila() {
        elementos = new ArrayList<>();
    }

    public void push(T elemento) {
        elementos.add(elemento);
    }

    public T pop() {
        if (estaVacio()) {
            return null;
        }

        T element = elementos.get(elementos.size() - 1);
        elementos.remove(elementos.size() - 1);
        return element;
    }

    public T peek() {
        if (estaVacio()) {
            return null;
        }

        T element = elementos.get(elementos.size() - 1);
        return element;
    }

    public boolean estaVacio() {
        if (elementos.isEmpty()) {
            return true;
        }
        return false;
    }

    public int numElementos() {
        return elementos.size();
    }
}
