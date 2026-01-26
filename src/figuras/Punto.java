package figuras;

public class Punto { // ESTO ES UNA CLASE DE TIPO PUNTO

    float x, y;

    public Punto(){
        
    }

    public Punto (float x, float y){ // ASIGNA LOS VALORES AL ATRIBUTO

        this.x = x;
        this.y = y;

    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto [x=" + x + ", y=" + y + "]";
    }

    

}
