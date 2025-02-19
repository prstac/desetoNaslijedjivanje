package Vozila;

/*
Dodatna varijabla: brojVrata (int).
Konstruktor za inicijalizaciju svih polja.
Implementacija metode kretanje(), koja ispisuje:
        "Automobil [tip], sa [brojVrata] vrata se kreće brzinom [brzina] km/h."
*/
public class Automobil extends Vozilo{
    private int brojVrata;

    public Automobil(String tip, double brzina, int brojVrata) {
        super(tip, brzina);
        this.brojVrata = brojVrata;
    }

    @Override
    public void kretanje() {
        System.out.printf("Automobil %s, sa %s vrata se kreće brzinom %.2f km/h\n",
                getTip(), brojVrata, getBrzina());
    }
}
