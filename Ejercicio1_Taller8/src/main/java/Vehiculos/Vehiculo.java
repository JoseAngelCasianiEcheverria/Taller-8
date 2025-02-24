/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Gercray
 */
public class Vehiculo {
    private double velocidadMax;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(double velocidadMax, String marca) {
        this.velocidadMax = velocidadMax;
        this.marca = marca;
    }
  
    public void mostrarDatos(){
        System.out.println("La marca de el vehiculo es: " + marca );
        System.out.println("La velocidad maxima es: "+ velocidadMax + " km/h");
    }
}

