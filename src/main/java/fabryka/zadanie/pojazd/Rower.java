package fabryka.zadanie.pojazd;

public class Rower extends Pojazd {

    public Rower(String kolor) {
        super(kolor);
    }

    @Override
    public void drive() {
        System.out.println("Dzyn Dzyn");
    }
}
