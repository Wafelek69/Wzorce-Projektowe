package metodaSzablonowa.zadanie;

import metodaSzablonowa.zadanie.bot.MailBot;
import metodaSzablonowa.zadanie.bot.NowyKlientMailBot;
import metodaSzablonowa.zadanie.bot.ZwykłyKlientMailBot;

public class MetodaSzabonowaMain {
    public static void main(String[] args) {

        MailBot nowy = new NowyKlientMailBot("Sprawdz nasza nowa oferte!");

        System.out.println(nowy.napiszMailing());
        System.out.println("************");
        MailBot nowy2 = new ZwykłyKlientMailBot("Nowa oferta !");
        System.out.println(nowy2.napiszMailing());

    }
}
