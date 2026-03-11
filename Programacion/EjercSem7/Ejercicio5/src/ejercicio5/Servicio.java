/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author Mario
 */
public class Servicio {

    private ArrayList<Estacion> estaciones;

    public Servicio(ArrayList<Estacion> estaciones) {
        this.estaciones = estaciones;
    }

    public ArrayList<Estacion> estacionesAlturaMayorde(double altura) {
        ArrayList<Estacion> estacionesAltitud = new ArrayList<>();
        for (Estacion estacion : estaciones) {
            if (estacion.getAltitud() > altura) {
                estacionesAltitud.add(estacion);
            }
        }
        return estacionesAltitud;
    }

    public double velocidadMediaEstaciones() {
        double suma = 0;
        for (Estacion estacion : estaciones) {
            suma += estacion.getVelocidadMaxViento();
        }
        return suma / estaciones.size();
    }

    public Estacion estacionMayorPrecipitacion() {
        Estacion mayorEstacion = estaciones.get(0);
        for (Estacion estacion : estaciones) {
            if (mayorEstacion.getPrecipitacion() > estacion.getPrecipitacion()) {
                mayorEstacion = estacion;
            }
        }
        return mayorEstacion;
    }

    public boolean estacionesPeligrosas() {
        boolean esPeligrosa = false;
        for (Estacion estacion : estaciones) {
            if (estacion.getVelocidadMaxViento() > 100) {
                esPeligrosa = true;
            }
        }
        return true;
    }

}
