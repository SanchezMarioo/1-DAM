/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mario.sanper.2
 */
public class GestorDrones {

    private ArrayList<Dron> drones = new ArrayList<>();
    private Random random = new Random();
    private final int MIN_ESTADO = 0;
    private final int MAX_ESTADO = 2;
    private final int MIN_HORAS = 8;
    private final int MAX_HORAS = 201;
    private final int NUM_DRONES = 7;
    
    public void rellenarFarolas() {
        for (int i = 0; i < NUM_DRONES; i++) {
            drones.add(new Dron(generarHorasVuelo(), generarEstado()));
        }
    }

    private Estado generarEstado() {
        int num = random.nextInt(MIN_ESTADO,MAX_ESTADO );
        return Estado.values()[num];
    }

    private int generarHorasVuelo() {
        return random.nextInt(MIN_HORAS, MAX_HORAS);
    }
}
