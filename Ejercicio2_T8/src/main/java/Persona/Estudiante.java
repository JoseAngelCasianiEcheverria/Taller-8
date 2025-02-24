/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persona;

/**
 *
 * @author Gercray
 */
public class Estudiante extends Persona{
    private int numMatricula;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int numMatricula) {
        super(nombre,edad);
        this.numMatricula = numMatricula;
    }

    public Estudiante(int numMatricula, String nombre, int edad) {
        super(nombre, edad);
        this.numMatricula = numMatricula;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El numero de matricula de el estudiante es: "+ numMatricula);
    }
}
