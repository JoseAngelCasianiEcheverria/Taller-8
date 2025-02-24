
package Empleado;

public class Empleado {
    private String nombre;
    private double salario;

    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("El salario es: "+salario);
    }
}
