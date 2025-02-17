package Zaposlenik;

public class Zaposlenik {
    String ime;
    double placa;
    Zaposlenik(String ime, double placa) {
        this.ime = ime;
        this.placa = placa;
    }
    void getInfo() {
        System.out.println("Zaposlenik " + ime +  " ima placu " + placa);
    }

    /*
    void radi() {
        System.out.println(ime + " radi");
    }*/

}
