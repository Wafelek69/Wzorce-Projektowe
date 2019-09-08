package metodaWytworcza.zadanie;

import metodaWytworcza.zadanie.Lampa.Lampa;
import metodaWytworcza.zadanie.Lampa.LampaE14;
import metodaWytworcza.zadanie.Lampa.LampaE27;

public class Main {
    public static void main(String[] args) {
        Lampa l1 = new LampaE27(150);
        Lampa l2 = new LampaE14(100);

        System.out.println(l1.przedstawSie());
        l1.wlacz();
        l1.wylacz();

        System.out.println(l2.przedstawSie());
        l2.wlacz();
        l2.wylacz();
    }
}
