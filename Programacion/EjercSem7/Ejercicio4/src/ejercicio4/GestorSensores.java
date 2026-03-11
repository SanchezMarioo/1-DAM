/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author mario.sanper.2
 */
public class GestorSensores {

    ArrayList<Sensor> sensores;
    private final double MIN_CO2 = 100.0;
    private final double MAX_CO2 = 2000.0;
    private final double MIN_TEMP = 10.0;
    private final double MAX_TEMP = 60.0;
    private final int SENSORES_DEFECTO = 7;
    private Random random = new Random();

    public GestorSensores() {
        sensores = new ArrayList<>();
        crearPorDefecto();
    }

    public void crearPorDefecto() {
        for (int i = 0; i < SENSORES_DEFECTO; i++) {
            sensores.add(new Sensor("S" + i,generarNivelPorDefecto(),generarTemperatura(),generarCiudad()));
        }
    }
    
    public double generarNivelPorDefecto() {
        return random.nextDouble(MIN_CO2, MAX_CO2);
    }
    public double generarTemperatura(){
        return random.nextDouble(MIN_TEMP, MAX_TEMP);
    }
    public Ciudad generarCiudad(){
        Ciudad ciudades[] = Ciudad.values();
        int numero = random.nextInt(ciudades.length);
        return ciudades[numero];
    }
    
    
}
