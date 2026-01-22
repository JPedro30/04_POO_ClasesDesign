package modelo;

@SuppressWarnings("unused")
public class Persona2 {
// ATRIBUTOS DE CLASE
    
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private int estatura;
    private float peso;

    // CONSTRUCTORES
    public Persona2(){
        // constructor vacio, lo creamos por defecto
    }
    
    public Persona2(String nombre, String apellidos){

        this.nombre = nombre;
        this.apellidos = apellidos;

    }

    public Persona2(String nombre, String apellidos, String dni){

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;

    }

    public Persona2(String nombre, String apellidos, int edad){

        this(nombre, apellidos);
        this.edad = edad;

    }

    public Persona2(String nombre, String apellidos, int edad, String dni, int estatura, float peso){
        
        this(nombre, apellidos, edad); // si ya tenemos un constructor que asigne datos, podemos partir de el para hacer el nuevo constructor
        this.dni = dni;
        this.estatura = estatura;
        this.peso = peso;

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
