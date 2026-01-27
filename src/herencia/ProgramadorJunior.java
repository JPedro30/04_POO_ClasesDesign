package herencia;

public class ProgramadorJunior extends Trabajador{

    private double beca;

    public ProgramadorJunior(String nombre, String dni, double beca) {
        super(nombre, dni); // LLAMA AL CONSTRUCTOR PADRE
        this.beca = beca;
    }

    @Override
    public double calculaPaga() {
        return beca; // LA BECA NO PAGA IMPUESTOS
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // MUESTRA INFO BASICA
        System.out.println("Tipo: Programador Junior (Becario)");
        System.out.println("Beca mensual: "+beca+" euros (sin impuestos)");
        System.out.println("Paga total: "+calculaPaga()+" euros");
    }
    
    
    

}
