/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mario.sanper.2
 */
public class Escritura {
    private String texto;
    private FileWriter fr;
    private BufferedWriter bf;
    private final String rutaEscrita;

    public Escritura(String texto, String rutaEscritura) {
        this.texto = texto;
        this.rutaEscrita = rutaEscritura;
    }


    public String getRutaEscrita() {
        return rutaEscrita;
    }
    

    
    
    public void escribirArchivo() throws IOException{
        try(BufferedWriter bf = new BufferedWriter(new FileWriter(rutaEscrita + "_copia")){
           bf.write(texto);
           
        }
    }
    
    
}
