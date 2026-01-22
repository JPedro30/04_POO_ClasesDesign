package modelo;

public class Persona1 {
// ATRIBUTOS DE CLASE
    String nombre;
    String apellidos;
    int edad;
    String dni;
    int estatura;
    float peso;

    // CONSTRUCTORES
    public Persona1(){
        // constructor vacio, lo creamos por defecto
    } 

    // METODOS O COMPORTAMIENTO
    public void caminar(){
        System.out.println("Estoy caminando.");
    }

    public void hablar(){
        System.out.println("Estoy hablando.");
    }

    public void nacer(){
        System.out.println("¡¡ACABO DE NACER!!");
    }

    public void morir(){
        System.out.println("I can't breath");
    }

}
