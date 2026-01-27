package interfaces;

public class Cebra extends Animal implements Presa{

    public Cebra() {
    }

    @Override
    public void vigilar() {
        System.out.println("A correr....");
    }

    public Cebra(String especie, String habitat) {
        super(especie, habitat);
    }

}
