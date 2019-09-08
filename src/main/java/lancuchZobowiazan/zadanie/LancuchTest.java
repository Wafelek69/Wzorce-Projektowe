package lancuchZobowiazan.zadanie;

public class LancuchTest {
    public static void main(String[] args) {

        Handler h = new Handler50();
        Handler h2 = new Handler70();



        System.out.println(h.obsluz(40));
        System.out.println(h.obsluz(60));
        System.out.println(h.obsluz(230));
        System.out.println(h2.obsluz(65));
        System.out.println(h2.obsluz(90));
        System.out.println(h2.obsluz(120));


    }
}
