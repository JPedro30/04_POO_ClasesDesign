package interfaces;

public class Rana extends Animal implements Cazador, Presa{

    public Rana() {
    }

    @Override
    public void vigilar() {
        System.out.println("¿Quien anda ahi?");
    }

    @Override
    public void acechar() {
        System.out.println("Que chinchorrita esta esa mosquita");
    }

    public Rana(String especie, String habitat) {
        super(especie, habitat);
    }

}
