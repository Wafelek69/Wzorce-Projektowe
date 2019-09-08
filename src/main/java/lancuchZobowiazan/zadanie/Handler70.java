package lancuchZobowiazan.zadanie;

public class Handler70 extends Handler  {

    @Override
    public String obsluz(int predkosc) {
        if(predkosc < 70) {
            return "UWAGA ZWOLNIJ ";
        } else {
            if(this.nastepny != null) {
                return nastepny.obsluz(predkosc);
            } else {
                return ":((";
            }
        }
    }
}
