package Osoba;

public class Osoba {
    String ime,prezime;
    String oib;
    String getOib() {
        return oib;
    }

    public static class Student extends Osoba{
        int matBrojStudenta;
        int getMatBrojStudenta() {
            return matBrojStudenta;
        }
    }
}
