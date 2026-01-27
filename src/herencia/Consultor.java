package herencia;

public class Consultor extends Trabajador{

    private double tarifaPorHora;
    private int horasTrabajadas;

    public Consultor(String nombre, String dni, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, dni); // LLAMADA AL METODO PADRE
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = 0;
    }

    public void registrarHoras(int horas){
        this.horasTrabajadas = horas;
    }

    @Override
    public double calculaPaga() {
        return tarifaPorHora * horasTrabajadas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // LLAMA AL METODO PADRE
        System.out.println("Tipo: Consultor");
        System.out.println("Tarifa / Hora: "+tarifaPorHora+" euros");
        System.out.println("Horas trabajadas: "+horasTrabajadas+" h");
        System.out.println("Paga total "+calculaPaga()+" euros");
    } 

}
