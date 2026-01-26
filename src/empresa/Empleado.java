package empresa;

public class Empleado {

    public String nombre;
    private double salario;
    protected String numeroEmpleado;
    int antiguedad;

    public Empleado(){
        
    }

    public Empleado(String nombre, double salario){
        this.nombre = nombre;
        this.salario = salario;
        this.numeroEmpleado = generarNumeroEmpleado();
        this.antiguedad = 0;
    }

    public void mostrarInformacionBasica(){
        System.out.println("Empleado: "+nombre);
    }

    private double calcularImpuesto(){
        // simulacion simple 21% impuestos
        return salario * 0.21;
    }

    protected void asignarNumeroEmpleado(String numero){
        this.numeroEmpleado = numero;
        System.out.println("Numero de empleado asignado: "+numero);
    }

    void actualizarAntiguedad(int años){
        this.antiguedad = años;
        System.out.println("Antiguedad actualizada a "+años+" años");
    }

    public double calcularSalarioNeto(){
        double impuestos = calcularImpuesto(); // acceso a metodo privado desde dentro
        return salario - impuestos;
    }

    public void mostrarInformacionCompleta(){
        System.out.println("\n--- INFORMACION COMPLETA ---");
        System.out.println("Nombre (public) "+nombre);
        System.out.println("Salario bruto (private) "+salario+" euros");
        System.out.println("Numero empleado (protected) "+numeroEmpleado);
        System.out.println("Antiguedad (sin modificador) "+antiguedad+" años");
        System.out.println("Impuestos (calculado con metodo private) "+calcularImpuesto()+" euros");
        System.out.println("Salario neto "+calcularSalarioNeto()+" euros");
    }

    private String generarNumeroEmpleado() {
        return "EMP" + System.currentTimeMillis() % 10000;
    }

}
