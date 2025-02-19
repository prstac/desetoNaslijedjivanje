package Vozila;

/*
Kreirajte apstraktnu klasu "Vozilo" sa sljedećim svojstvima:
Varijable:
tip (String)
brzina (double)
Konstruktor za inicijalizaciju ovih varijabli.
Getter metode za tip i brzinu.
Apstraktna metoda kretanje(), koja će biti implementirana u podklasama.
 */
public abstract class Vozilo {
    private String tip;
    private double brzina;

    public Vozilo(String tip, double brzina) {
        this.tip = tip;
        this.brzina = brzina;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public double getBrzina() {
        return brzina;
    }

    public void setBrzina(double brzina) {
        this.brzina = brzina;
    }

    abstract public void kretanje();
}
