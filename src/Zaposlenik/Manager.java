package Zaposlenik;

public class Manager extends Zaposlenik{
    public Manager(String ime, double placa) {
        super(ime, placa);
    }

    void radi() {
        System.out.println( ime + " upravlja timom");
    }
}
