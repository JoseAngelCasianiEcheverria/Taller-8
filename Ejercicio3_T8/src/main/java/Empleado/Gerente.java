/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Empleado;

/**
 *
 * @author Gercray
 */
public class Gerente extends Empleado{
    private String departamento;

    public Gerente() {
    }

    public Gerente(String departamento, String nombre, double salario) {
        super(nombre, salario);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El departamento de el gerente es: "+departamento);
    }
    
    
    
    
}
