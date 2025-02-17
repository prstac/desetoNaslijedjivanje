package Zaposlenik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var zaposlenik = new Zaposlenik("Zaposlenik", 1);
        var programer = new Programer("Programer", 2);
        var manager = new Manager("Manager", 3);

        System.out.println("Što radi programer?");
        programer.radi();

        System.out.println();

        System.out.println("Što radi manager?");
        manager.radi();

        System.out.println();

        List<Zaposlenik> zaposlenici = new ArrayList<>();
        zaposlenici.add(zaposlenik);
        zaposlenici.add(manager);
        zaposlenici.add(programer);

        System.out.println("Podaci o svim zaposlenicima:");
        zaposlenici.forEach(z -> z.getInfo());

        System.out.println();

        System.out.println("Svi rade:");
        zaposlenici.forEach(z -> z.radi());
    }
}
