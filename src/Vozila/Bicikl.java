package Vozila;

/*
Dodatna varijabla: vrsta (String, npr. "Planinski", "Cestovni").
Konstruktor za inicijalizaciju svih polja.
Implementacija metode kretanje(), koja ispisuje:
"Bicikl [tip] [vrsta] se kreće brzinom [brzina] km/h."
 */
public class Bicikl extends Vozilo{
    private String vrsta;

    public Bicikl(String tip, double brzina, String vrsta) {
        super(tip, brzina);
        this.vrsta = vrsta;
    }

    @Override
    public void kretanje() {
        System.out.printf("Bicikl %s %s se kreće brzinom %.2f km/h\n", getTip(), vrsta, getBrzina());
    }
}
