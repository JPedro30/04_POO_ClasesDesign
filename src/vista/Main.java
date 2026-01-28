package vista;

//import empresa.DepartamentoRRHH; NO SE PUEDE IMPORTAR YA QUE NO ES VISIBLE POR QUE NO TIENE MODIFICADOR
import empresa.Empleado;
import estaticos.Bicicleta;
import excepciones.DniException;
import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
import herencia.Consultor;
import herencia.Programador;
import herencia.ProgramadorJunior;
import herencia.Trabajador;
import interfaces.Cebra;
import interfaces.Leon;
import interfaces.Rana;
import modelo.Persona1;
import modelo.Persona2;
import modelo.Persona3;

@SuppressWarnings("unused")
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("POO - Diseño de clases");

        //estudioClasePersona();
        //estudioConstructores();
        //estudioPropiedadesYMetodos();
        //estudioEquals();
        //estudioArgumentos();
        //estudioPasoPorValorYReferencias();
        //estudioMetodosEstaticos();
        //estudioModificadores();
        estudioHerencia();
        //estudioInterface();

    }

    private static void estudioInterface() {
        Leon leon=new Leon("mamifero", "sabana");
        Cebra cebra=new Cebra("mamifero", "sabana");
        Rana rana=new Rana("anfibio", "charca");
        leon.acechar();
        cebra.vigilar();
        rana.acechar();
        rana.vigilar();
    }

    private static void estudioHerencia() {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     HERENCIA Y POLIMORFISMO EN JAVA    ║");
        System.out.println("╚════════════════════════════════════════╝\n");

        // Crear diferentes tipos de trabajadores
        Programador prog1 = new Programador("Ana García", "12345678A", 2500);
        ProgramadorJunior junior1 = new ProgramadorJunior("Carlos López", "87654321B", 800);
        Consultor consultor1 = new Consultor("María Pérez", "11223344C", 45);

        // El consultor registra sus horas
        consultor1.registrarHoras(120);


        System.out.println("═══════════════════════════════════════════");
        System.out.println(" INFORMACIÓN DE CADA TRABAJADOR");
        System.out.println("═══════════════════════════════════════════\n");

        prog1.mostrarInfo();
        System.out.println();

        junior1.mostrarInfo();
        System.out.println();

        consultor1.mostrarInfo();


        System.out.println("\n═══════════════════════════════════════════");
        System.out.println(" DEMOSTRACIÓN DE POLIMORFISMO");
        System.out.println("═══════════════════════════════════════════\n");

        // POLIMORFISMO: Un array de Trabajadores que contiene objetos de diferentes clases
        Trabajador[] trabajadores = { prog1, junior1, consultor1 };
        System.out.println(" Lista de nóminas del mes:\n");
        double totalNominas = 0;

        // El MISMO método calcularPaga() se comporta diferente según el tipo real del objeto
        for (Trabajador t : trabajadores) {
            double paga = t.calculaPaga(); // ← POLIMORFISMO en acción
            totalNominas += paga;
            System.out.println(" " + t.nombre + " -> " + paga + " euros");
        }
        System.out.println("\n TOTAL NÓMINAS: " + totalNominas + " euros");

        
        System.out.println("\n═══════════════════════════════════════════");
        System.out.println(" EXPLICACIÓN DEL POLIMORFISMO");
        System.out.println("═══════════════════════════════════════════\n");

        System.out.println(" Todos los objetos son de tipo Trabajador (clase padre)");
        System.out.println(" Pero cada uno ejecuta SU PROPIA versión de calcularPaga():");
        System.out.println(" - Programador: sueldo - 21% impuestos");
        System.out.println(" - ProgramadorJunior: beca (sin impuestos)");
        System.out.println(" - Consultor: tarifa x horas");
        System.out.println("\n¡Esto es POLIMORFISMO! ");

    }

    private static void estudioModificadores() {
        // ACCESO A CLASES
         System.out.println("--- 1. ACCESO A CLASES ---");

        // ✅ PÚBLICO: Se puede acceder desde cualquier parte
        Empleado empleado1 = new Empleado("Ana García", 35000);
        System.out.println("✅ Puedo crear objeto Empleado (es public)");

        // ❌ SIN MODIFICADOR: NO se puede acceder desde otro paquete
        // DepartamentoRRHH rrhh = new DepartamentoRRHH();
        System.out.println("❌ NO puedo crear objeto DepartamentoRRHH (sin modificador, solo visible en su paquete)");


        // ACCESO A ATRIBUTOS Y METODOS
        System.out.println("\n--- 2. ACCESO A ATRIBUTOS Y MÉTODOS ---");
        // Probando acceso a miembros de Empleado
        System.out.println("Intentando acceder a miembros de Empleado:");

        // ATRIBUTOS CON LOS MODIFICADORES

        // ✅ PUBLIC
        empleado1.nombre = "Ana García López";
        System.out.println("✅ nombre: " + empleado1.nombre);

        // ❌ PRIVATE
        // empleado1.salario = 40000;
        System.out.println("❌ salario: NO ACCESIBLE (es private)");

        // ❌ PROTECTED
        // empleado1.numeroEmpleado = "EMP001";
        System.out.println("❌ numeroEmpleado: NO ACCESIBLE (es protected, y no estamos en el mismo paquete ni heredamos)");
        
        // ❌ SIN MODIFICADOR
        // empleado1.antiguedad = 5;
        System.out.println("❌ antiguedad: NO ACCESIBLE (sin modificador, solo visible en el mismo paquete)");


        // METODOS CON LOS MODIFICADORES
        System.out.println("\n--- 3. ACCESO A MÉTODOS ---");

        // ✅ PUBLIC
        empleado1.mostrarInformacionBasica();

        // ❌ PRIVATE
        // empleado1.calcularImpuestos();
        System.out.println("❌ calcularImpuestos(): NO ACCESIBLE (método privado)");

        // ❌ PROTECTED
        // empleado1.asignarNumeroEmpleado();
        System.out.println("❌ asignarNumeroEmpleado(): NO ACCESIBLE (método protected)");

        // ❌ SIN MODIFICADOR
        // empleado1.actualizarAntiguedad();
        System.out.println("❌ actualizarAntiguedad(): NO ACCESIBLE (método sin modificador)");


        // METODOS QUE USA METODOS PRIVADOS
        System.out.println("\n--- 4. MÉTODO PÚBLICO QUE USA MÉTODOS PRIVADOS ---");
        System.out.println("Salario neto calculado: " + empleado1.calcularSalarioNeto() + "€");

        System.out.println("\n--- 5. INFORMACIÓN COMPLETA (desde dentro de la clase) ---");
        empleado1.mostrarInformacionCompleta();
    }

    private static void estudioMetodosEstaticos() {
        Bicicleta bici1 = new Bicicleta(21, 27, 0);
        Bicicleta bici2 = new Bicicleta(18, 24, 0);

        System.out.println(bici1);
        System.out.println(bici2);

        //System.out.println(bici1.getNumeroDeBicicleta()); NO DEBERIA DE HACER FALTA USAR EL OBJETO PARA ACCEDER A LA VARIABLE ESTATICA YA QUE EL RESULTADO NO CAMBIA LLAME AL OBJETO QUE LLAME
        System.out.println(Bicicleta.getNumeroDeBicicleta()); // ASI QUE MEJOR LLAMO DIRECTAMENTE A LA CLASE CON EL METODO PARA SABER EL VALOR DE LA VARIABLE
    }

    private static void estudioPasoPorValorYReferencias() {
        
        Circulo circle = new Circulo(2,3);
        System.out.println(circle); // llamando al objeto una vez definido el toString();
        //System.out.println(circle.toString()); no hace falta llamar explicitamente al toString, ya que se llama automaticamente por defecto
        moveCircle(circle,23,56);
        System.out.println(circle.toString());

    }

    private static void moveCircle(Circulo circle, int i, int j) {
        circle.setX(circle.getX()+i); // asigno el valor con set, con el valor que tenia que lo recibo con get mas el nuevo valor que es i
        circle.setY(circle.getY()+j);

        circle = new Circulo(1,1); // aqui he instanciado el objeto en el metodo entonces se ha creado un nuevo objeto en memoria y en referencia asi que no se machaca el que se ha mandado por referencia por parametros
        System.out.println(circle);
    }

    private static void estudioArgumentos(){

        Punto punto1 = new Punto(0,0);
        Punto punto2 = new Punto(5,0);
        Punto punto3 = new Punto(5,3);
        Punto punto4 = new Punto(0,3);

        Rectangulo rectangulo1 = new Rectangulo(punto1, punto2, punto3, punto4); // aqui estoy mandando una lista de objetos por parametros a otro objeto
        Punto[] puntos = {punto1,punto2,punto3,punto4}; // aqui estoy haciendo un array de objetos de una clase que es un objeto
        rectangulo1 = new Rectangulo(puntos); // y aqui paso ese array por parametros a otro objeto, machacando previamente lo que habia pasado (que era exactamente lo mismo)
        
        System.out.println(rectangulo1.toString()); // podemos usar el .toString por que lo tenemos definido y sobreescrito

        Punto[] puntos2 = {punto1,punto2,punto3};
        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setOtraFigura(puntos2);
        System.out.println(rectangulo2.toString());

    }
    
    private static void estudioEquals() {
        try {
            Persona3 nuevaPersona1 = new Persona3("Pedro", "Gonzalez", 26, "47348673E");
            Persona3 nuevaPersona2 = new Persona3("Pedro", "Gonzalez", 26, "47348673E");
            System.out.println("Comprueba el hascode (creo que es el lugar de memoria) de cada objeto : "+nuevaPersona1.equals(nuevaPersona2)); // esto da false por que son dos objetos instanciados en memoria en lugares distintos, se puede sobreescribir en la clase para que si devuelva un true
            System.out.println("Comprueba los datos de cada objeto : "+nuevaPersona1.toString().equals(nuevaPersona2.toString())); // ahora este si da true ya que los atributos dentro de ese objeto si son iguales
            System.out.println(nuevaPersona1.hashCode()); // hemos sobreescrito el hascode en base al dni, ya que si dos dni son iguales, tiene que ser la misma persona
            System.out.println(nuevaPersona2.hashCode());
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void estudioPropiedadesYMetodos(){
        try {
            Persona3 nuevaPersona1 = new Persona3("Pedro", "Gonzalez", 26, "47348673E");
            System.out.println(nuevaPersona1.mostrarDatos());
            System.out.println(nuevaPersona1.toString()); // esto no devuelve los datos, devuelve informacion de la clase, salvo que sobrecarguemos el metodo toString() (el IDE lo hace solo)
        } catch (DniException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void estudioConstructores() {
        
        Persona2 persona1 = new Persona2("Marcos", "Porrero");
        Persona2 persona2 = new Persona2("Arturo", "Belladurmiente", 19);
        Persona2 persona3 = new Persona2("Pedro", "Jose", 26, "41740", 167, (float)85.5); // he tenido que hacer casting a float por que me lo reconocia como doble al poner punto

        persona3 = null;

        persona3 = new Persona2("Jose Pedro", "Rencoroso", 26);

    }

    private static void estudioClasePersona() {
        // Instanciamos el objeto persona
        Persona1 persona1 = new Persona1();
        Persona1 persona2 = new Persona1();
        Persona1 persona3 = new Persona1();

        // Usamos los objetos
        persona1.morir();
        persona2.nacer();
        persona3.caminar();

        // Destruimos los objetos
        persona1 = null;
        persona2 = null;
        persona3 = null;

        persona1 = new Persona1();
        // Puedo volver a trabajar con el objeto y cuando termine
        persona1 = null;

    }

}
