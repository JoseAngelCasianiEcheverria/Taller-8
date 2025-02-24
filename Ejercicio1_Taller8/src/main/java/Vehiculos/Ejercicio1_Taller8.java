/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vehiculos;

/**
 *
 * @author Gercray
 */
public class Ejercicio1_Taller8 {

    public static void main(String[] args) {
        Vehiculo ve1 = new Vehiculo(150, "AUDI");
        Coche coh1 = new Coche(170,"PORCHE", 4);
        
        ve1.mostrarDatos();
        System.out.println("");
        coh1.mostrarDatos();
    }
}
