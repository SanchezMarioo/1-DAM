/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

import java.util.ArrayList;

/**
 *
 * @author mario.sanper.2
 */
public class ReproductorMusical implements ColaCanciones {

    private ArrayList<String> canciones;

    public ReproductorMusical() {
        canciones = new ArrayList<>();
    }

    @Override
    public void añadirCola(String nombre) {
        canciones.add(nombre);
    }

    @Override
    public String siguenteCancion(String cancion) {
        if (tamanoCola() < 0) {
            return null;
        }
        return canciones.remove(0);
    }

    @Override
    public void mostrarCola() {
        if (tamanoCola() < 0) {
            return;
        }
        for (String cancion : canciones) {
            System.out.println(cancion);
        }

    }

    @Override
    public int tamanoCola() {
        return canciones.size();
    }

}
