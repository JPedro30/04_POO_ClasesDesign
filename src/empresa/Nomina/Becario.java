package empresa.Nomina;

import empresa.Empleado;

public class Becario extends Empleado{

    private int horasFormacion;

    public Becario(String nombre, double salario){
        super(nombre, salario);
        this.horasFormacion = 0;
    }

    public void probarAccesoHerencia(){
        System.out.println("\n--- Desde Becario {paquete 'empresa.nominas', pero HEREDA de Empleado} ---");

        // PUBLIC SIEMPRE ACCESIBLE
        this.nombre = "Modificado desde Becario";
        System.out.println("nombre (public): " + this.nombre);

        // PROTECTED ACCESIBLE PORQUE HEREDAMOS, AUNQUE ESTEMOS EN OTRO PAQUETE
        this.numeroEmpleado = "BEC-001";
        System.out.println("numeroEmpleado (protected): " + this.numeroEmpleado);

        // SIN MODIFICADOR NO ACCESIBLE (SOLO EN MISMO PAQUETE)
        //this.antiguedad=1;
        System.out.println("antiguedad (sin modificador): NO ACCESIBLE (distinto paquete)");

        // PRIVATE NO ACCESIBLE NI SIQUEIRA HEREDANDO
        //this.salario = 15000;
        System.out.println("salario (private): NO ACCESIBLE (es private)");

        System.out.println("\nProbando metodos heredados:");

        // PUBLIC
        this.mostrarInformacionBasica();

        // PROTECTED
        this.asignarNumeroEmpleado("BEC-2024-001");

        // SIN MODIFICADOR
        //this.actualizarAntiguedad(1);
        System.out.println("actualizarAntiguedad(): NO ACCESIBLE (sin modificador, diferente paquete)");

        // PRIVATE
        //this.calcularImpuestos();
        System.out.println("calcularImpuestos(): NO ACCESIBLE (private)");
    }

    public void probarAccesoSinHerencia(){
        Empleado empleadoExterno = new Empleado("Pedro Lopez", 32000);

        System.out.println("\n--- Desde Becario creando objeto Empleado (SIN usar herencia) ---");

        // SOLO PUBLIC ES ACCESIBLE EN OBJETOS EXTERNOS
        empleadoExterno.nombre = "OK desde Becario";
        System.out.println("nombre (public): Accesible");

        // PROTECTED NO ACCESIBLE EN OBJETOS EXTERNOS (SOLO EN HERENCIA CON 'THIS')
        //empleadoExterno.numeroEmpleado="NO";
        System.out.println("numeroEmpleado (protected) NO ACCESIBLE");
        System.out.println("IMPORTANTE: protected solo funciona 'this', no con objetos externos");

        // LOS DEMAS TAMPOCO
        System.out.println("antiguedad (sin modificador) NO ACCESIBLE");
        System.out.println("salario (private) NO ACCESIBLE");
    }

    // METODO ESPECIFICO DE BECARIO

    public void registrarHorasFormacion(int horas){
        this.horasFormacion += horas;
        System.out.println(this.nombre+" ha completado "+horas+" horas de formacion");
        System.out.println("Total horas de formacion: "+this.horasFormacion);
    }

}
