/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Persona;

/**
 *
 * @author Gercray
 */
public class Ejercicio2_T8 {

    public static void main(String[] args) {
        Persona pers = new Persona("Jaider", 17);
        Estudiante estu = new Estudiante("Jose", 18, 151354);
        
        estu.mostrarDatos();
        System.out.println("");
        pers.mostrarDatos();
    }
}
