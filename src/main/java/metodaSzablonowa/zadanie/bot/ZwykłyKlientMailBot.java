package metodaSzablonowa.zadanie.bot;

public class ZwykłyKlientMailBot extends MailBot{

    public ZwykłyKlientMailBot(String glownaTresc) {
        super(glownaTresc);
    }

    public String napiszNaglowek() {
        return "Drogi/Droga";
    }

    public String napiszStopke() {
        return "Pozdrawiamy!";
    }
}
