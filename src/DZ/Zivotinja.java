package DZ;

public class Zivotinja {
    String naziv;
    Zivotinja(String naziv) {
        this.naziv = naziv;
    }
    String glasajSe(){
        return "Živ živ!";
    };

    void printInfo() {
        System.out.println(naziv + " se glasa: " + glasajSe());
    }
}

