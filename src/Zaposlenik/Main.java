package Zaposlenik;

import com.sun.source.tree.ReturnTree;

import javax.management.ObjectInstance;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Zaposlenik zaposlenik = new Zaposlenik("Zaposlenik", 1);
        Programer programer = new Programer("Programer", 2);
        Manager manager = new Manager("Manager", 3);

        Zaposlenik zaposlenik1= new Manager("Pero manager", 4);
        Zaposlenik zaposlenik2= new Programer("Pero programer", 4);

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
        //zaposlenici.forEach(z -> z.radi());

        System.out.println();
        System.out.println("Manager kao zaposlenik");
        //zaposlenik1.radi();
        if (zaposlenik1 instanceof Manager) { // instanceof provjera prije downcastanja
            Manager zap1 = (Manager) zaposlenik1;
            System.out.println("Manager kao manager");
            zap1.radi(); // dohvacamo metode klase manager
        } else {
            System.out.println("Downcast nije moguc");
        }

        if (zaposlenik2 instanceof Programer) {
            ((Programer) zaposlenik2).radi();
        } else {
            System.out.println("Downcast nije moguc");
        }

    }
}
