
package Animal;

public class Animal {
    private String especie;

    public Animal() {
    }

    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void mostrarDatos(){
        System.out.println("La especie es: "+especie);
    }
}
