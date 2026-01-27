package estaticos;

public class Bicicleta {

    private int numMarchas;
    private int diametroRueda;
    private int velocidad;
    private int id;

    // Variables ESTATICAS es una variable que es comun a todos los objetos
    private static int numeroDeBicicletas = 0;

    public Bicicleta(){
        
    }

    public Bicicleta (int numMarchas, int diametroRueda, int velocidad){
        this.numMarchas=numMarchas;
        this.diametroRueda=diametroRueda;
        this.velocidad=velocidad;
        id=++numeroDeBicicletas;
    }

    public static int getNumeroDeBicicleta(){
        // No podemos usar this
        // return this.numeroDeBicicletas;
        return numeroDeBicicletas;
    }

    public int getNumMarchas() {
        return numMarchas;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public int getDiametroRueda() {
        return diametroRueda;
    }

    public void setDiametroRueda(int diametroRueda) {
        this.diametroRueda = diametroRueda;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Bicicleta [numMarchas=" + numMarchas + ", diametroRueda=" + diametroRueda + ", velocidad=" + velocidad
                + ", id=" + id + "]";
    }


}
