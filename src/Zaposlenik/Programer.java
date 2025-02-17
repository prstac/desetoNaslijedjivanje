package Zaposlenik;

public class Programer extends  Zaposlenik{
    public Programer(String ime, double placa) {
        super(ime, placa);
    }

    void radi() {
        System.out.println(ime + " pise kod");
    }
}
