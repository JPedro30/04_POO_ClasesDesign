package modelo;

import excepciones.DniException;

public class Persona3 {
// ATRIBUTOS DE CLASE
    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;
    private int estatura;
    private float peso;

    // CONSTRUCTORES
    public Persona3(){
        // CONSTRUCTOR VACIO
    }

    public Persona3(String nombre, String apellidos) {
        // AQUI NO SE ESTAN CONTROLANDO LOS DATOS, ESTO ES LO QUE GENERA AUTOMATICAMENTE
        //this.nombre = nombre;
        //this.apellidos = apellidos;

        // AQUI SI SE CONTROLAN LOS DATOS
        this.setNombre(nombre);
        this.setApellidos(apellidos);
    }

    public Persona3(String nombre, String apellidos, int edad, String dni) throws DniException {
        this(nombre, apellidos); // aqui utilizo el constructor de arriba ya que si que controla los datos
        this.setEdad(edad);
        this.setDni(dni);
    }

    public Persona3(String nombre, String apellidos, int edad, String dni, int estatura, float peso) throws DniException {
        this(nombre, apellidos, edad, dni);
        this.setEstatura(estatura);
        this.setPeso(peso);
    }

    // SETTERS Y GETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        // VALIDAR NOMBRE
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) throws DniException {
        validaDNI(dni);
        this.dni = dni;
    }

    private void validaDNI(String dni) throws DniException {
        if (dni==null || dni.length()!=9) {
            throw new DniException();
        }
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String mostrarDatos(){
        return nombre+","+apellidos+","+edad+","+dni;
    }

    @Override
    public String toString() {
        return "Persona3 [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", dni=" + dni
                + ", estatura=" + estatura + ", peso=" + peso + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona3 other = (Persona3) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    
}
