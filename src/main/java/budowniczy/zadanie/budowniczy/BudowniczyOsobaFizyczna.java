package budowniczy.zadanie.budowniczy;

public class BudowniczyOsobaFizyczna extends Budowniczy {

    public BudowniczyOsobaFizyczna() {
        super();
        this.prototyp.setVatPayer(true);
    }


    @Override
    public boolean czyDaneOsoboweKompletne() {
        return false;
    }
}
