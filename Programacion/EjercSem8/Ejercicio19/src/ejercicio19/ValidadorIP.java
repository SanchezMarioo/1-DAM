/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio19;

/**
 *
 * @author mario.sanper.2
 */
public class ValidadorIP {
    private String validarIP = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
    
    public boolean esValida(String direccion){
        return direccion.matches(validarIP);
    }
}
