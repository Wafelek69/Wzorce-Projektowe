package metodaWytworcza.zadanie.Lampa;

import metodaWytworcza.zadanie.Zarowka.Zarowka;
import metodaWytworcza.zadanie.Zarowka.ZarowkaE14;

public class LampaE14 extends Lampa {

    public LampaE14(int moc) {
        super(moc);
        this.typ = "Lampa z gwintem typu E14";
    }

    @Override
    protected Zarowka generateZarowka(int moc) {
        return new ZarowkaE14(moc);
    }
}
