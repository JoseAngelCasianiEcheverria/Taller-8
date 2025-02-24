/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Animal;

/**
 *
 * @author Gercray
 */
public class Ejercicio5_T8 {

    public static void main(String[] args) {
        Animal ani = new Animal("siluro");
        Pez pez = new Pez("Tranquilas y profundas", "siluro");
        
        ani.mostrarDatos();
        System.out.println("");
        pez.mostrarDatos();
    }
}
