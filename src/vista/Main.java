package vista;

import excepciones.DniException;
import figuras.Circulo;
import figuras.Punto;
import figuras.Rectangulo;
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
        estudioPasoPorValorYReferencias();


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
