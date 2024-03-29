package fabryka.zadanie.fabryka;

import fabryka.zadanie.PojazdType;
import fabryka.zadanie.pojazd.Pojazd;
import fabryka.zadanie.pojazd.Rower;
import fabryka.zadanie.pojazd.Samochod;

public class FabrykaPojazdow extends Fabryka {

    public Pojazd buildPojazd(String kolor, PojazdType typ) {
        Pojazd p;
        switch (typ) {
            case MOTOR: {
                p = null;
                break;
            }
            case ROWER: {
                p = new Rower(kolor);
                break;
            }
            case SAMOCHOD: {
                p = new Samochod(kolor);
                break;
            }
            default: {
                System.out.println("Tego nie mamy!");
                p = null;
            }
        }
        return p;
    }
}
