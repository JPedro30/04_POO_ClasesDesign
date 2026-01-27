package herencia;

public class Trabajador {

    public String nombre;
    protected String dni;

    public Trabajador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public double calculaPaga(){
        return 0.0;
    }

    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" | DNI: "+dni);
    }
}
