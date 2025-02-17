package Zaposlenik;

public class Manager extends Zaposlenik{
    public Manager(String ime, double placa) {
        super(ime, placa);
    }

    void Radi() {
        System.out.println( ime + " upravlja timom");
    }
}
