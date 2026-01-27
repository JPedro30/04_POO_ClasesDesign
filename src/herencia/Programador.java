package herencia;

public class Programador extends Trabajador{

    protected double sueldoFijo;
    private static final double PORCENTAJE_IMPUESTOS = 0.21; // 21% IMPUESTOS

    public Programador(String nombre, String dni, double sueldoFijo) {
        super(nombre, dni); // DEBE DE LLAMAR AL CONSTRUCTOR DE LA CLASE PADRE PARA ASIGNAR NOMBRE Y DNI
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double calculaPaga() {
        double impuestos = sueldoFijo * PORCENTAJE_IMPUESTOS;
        return sueldoFijo-impuestos;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // LLAMA AL METODO PADRE
        System.out.println("Tipo: Programador");
        System.out.println("Sueldo bruto: "+sueldoFijo+" euros");
        System.out.println("Sueldo neto: "+calculaPaga()+" euros");
    }

    

    

}
