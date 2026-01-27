package interfaces;

public class Leon extends Animal implements Cazador{

    public Leon() {
    }

    @Override
    public void acechar() {
        System.out.println("Vata lomito tiene esta cebra");
    }

    public Leon(String especie, String habitat) {
        super(especie, habitat);
    }

    

}
