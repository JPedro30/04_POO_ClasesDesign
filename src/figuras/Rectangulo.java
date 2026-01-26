package figuras;

import java.util.Arrays;

public class Rectangulo {

    private Punto[] puntos; // AQUI CREAMOS UN ARRAY DE LA CLASE QUE CREAMOS ANTES DE TIPO PUNTO
    public Rectangulo(){

    }

    public Rectangulo(Punto p1, Punto p2, Punto p3, Punto p4){
        puntos = new Punto[]{p1,p2,p3,p4}; // AQUI ESTAMOS DECLARANDO, INSTANCIANDO Y RELLENANDO IGUAL COMO CUANDO TRABAJABAMOS CON ENTEROS
    }
    public Rectangulo(Punto[]puntos){ // AQUI DECLARAMOS LOS PUNTOS EN OTRA PARTE Y EL CONSTRUCTOR ASIGNA LOS PUNTOS A LOS ATRIBUTOS
        this.puntos=puntos;
    }
    public void setOtraFigura(Punto...puntos){ // ESTO SE LLAMA BARACK ES PARA PODER RECIBIR DISTINTO TIPOS DE DATOS PARA PODER HACER DESDE UN TRIANGULO, HEPTAGONO ETC ETC
        this.puntos=puntos;
    }

    public Punto[] getPuntos() { // GETTER QUE DEVUELVE EL ARRAY DE PUNTO
        return puntos;
    }

    public void setPuntos(Punto[] puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Rectangulo [puntos=" + Arrays.toString(puntos) + "]";
    }
    
}
