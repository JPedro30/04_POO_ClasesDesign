package empresa;

class DepartamentoRRHH {

    private String nombreDepartamento = "Recurso Humanos";

    public void mostrarInfo(){
        System.out.println("Departamento: "+nombreDepartamento);
        System.out.println("Esta clase solo es visible en el paquete 'empresa'");
    }

    public void gestionarEmpleado(Empleado empleado){
        System.out.println("\n--- Desde DepartamentoRRHH {mismo paquete 'empresa'} ---");

        // PUBLIC: SIEMPRE ACCESIBLE
        empleado.nombre="Modificado desde RRHH";
        System.out.println("nombre: Accesible y modificable");

        // PRIVATE: NO ACCESIBLE NI SIQUIERA DESDE EL MISMO PAQUETE
        //empleado.salario = 50000;
        System.out.println("salario: NO ACCESIBLE (es private)");

        // PROTECTED: ACCESIBLE PORQUE ESTAMOS EN EL MISMO PAQUETE
        empleado.numeroEmpleado = "EMP-RRHH-001";
        System.out.println("numeroEmpleado: Accesible (protected en mismo paquete)");

        // SIN MODIFICADOR: ACCESIBLE PORQUE ESTAMOS EN EL MISMO PAQUETE
        empleado.antiguedad=3;
        System.out.println("antiguedad: Accesible (sin modificador en mismo paquete)");

        System.out.println("\nProbando metodos:");

        // METODOS PUBLIC, PROTECTED Y SIN MODIFICADOR SON ACCESIBLES
        empleado.mostrarInformacionBasica();
        empleado.asignarNumeroEmpleado("EMP-2024-001");
        empleado.actualizarAntiguedad(5);

        // METODOS PRIVATE NO SON ACCESIBLES
        //empleado.calcularImpuestos();
        System.out.println("calcularImpuestos(): NO ACCESIBLE (es private)");
    }

    public void contratarNuevoEmpleado(){
        Empleado nuevoEmpleado = new Empleado("Carlos Martinez", 28000);
        System.out.println("\nNuevo empleado contratado: "+nuevoEmpleado.nombre);

        // desde aqui podemos gestionar todos los aspectos del empleado
        // excepto los privados
        gestionarEmpleado(nuevoEmpleado);
    }

}
