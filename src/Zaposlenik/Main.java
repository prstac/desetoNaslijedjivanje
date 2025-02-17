package Zaposlenik;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var programer = new Programer("Programer", 1);
        var manager = new Manager("Manager", 3);
        var zaposlenik = new Zaposlenik("Zaposlenik", 2);
        programer.Radi();
        manager.Radi();
        List<Zaposlenik> zaposlenici = new ArrayList<>();
        zaposlenici.add(zaposlenik);
        zaposlenici.add(manager);
        zaposlenici.add(programer);
        zaposlenici.forEach(z -> z.getInfo());
    }
}
