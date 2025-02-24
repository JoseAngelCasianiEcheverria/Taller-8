
package Persona;

public class Empleado extends Persona{
    private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, int edad,String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("El departamento de el gerente es: "+departamento);
    }
}
