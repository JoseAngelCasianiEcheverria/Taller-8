/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Empleado;

/**
 *
 * @author Gercray
 */
public class Ejercicio3_T8 {

    public static void main(String[] args) {
        Empleado emple = new Empleado("Raul", 2500);
        Gerente gere = new Gerente("Sistema", "Daby", 5000);
        
        emple.mostrarDatos();
        System.out.println("");
        gere.mostrarDatos();
    }
}
