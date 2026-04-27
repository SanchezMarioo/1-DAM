/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio18;

/**
 *
 * @author mario.sanper.2
 */
public class Gestor {
    private final int MAX_PRODUCTOS = 5;
    private Producto productos[] = new Producto[MAX_PRODUCTOS];
    private void añadirProducto(Producto producto){
       int contador = 0;
       productos[contador] = producto;
       contador++;
    }
    private void cargarDatos(){
        añadirProducto(new Producto("Camiseta"));
        añadirProducto(new Producto("Pantalon"));
        añadirProducto(new Producto("Zapatillas"));
        añadirProducto(new Producto("Chaqueta"));
    }
    public void init(){
        System.out.println("Dime el posicion del array: ");
    }
    private Producto consultarProducto(int posicion){
        try{
            Producto productoPosicion = productos[posicion];
            
        } ca
    }
}
