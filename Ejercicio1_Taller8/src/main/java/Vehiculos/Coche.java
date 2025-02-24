/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

/**
 *
 * @author Gercray
 */
public class Coche extends Vehiculo{
    private int numPuertas;
    

    public Coche() {
    }

    public Coche(double velocidadMax, String marca, int numPuertas) {
        super(velocidadMax, marca);
        this.numPuertas = numPuertas;
    }

    @Override
    
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El numero de puertas de el coche es de: " + numPuertas);
    }
}
