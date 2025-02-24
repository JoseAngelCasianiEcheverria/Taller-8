
package Persona;

public class Ejercicio4_T8 {

    public static void main(String[] args) {
        Persona pers = new Persona("Raul", 25);
        Empleado emple = new Empleado("Felipe", 20, "Marketing");
        
        pers.mostrarDatos();
        System.out.println("");
        emple.mostrarDatos();
    }
}
