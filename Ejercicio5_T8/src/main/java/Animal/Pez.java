
package Animal;

public class Pez extends Animal{
    private String tipodeAgua;

    public Pez() {
    }

    public Pez(String tipodeAgua, String especie) {
        super(especie);
        this.tipodeAgua = tipodeAgua;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo de agua donde viven: " + tipodeAgua);
    }
}
