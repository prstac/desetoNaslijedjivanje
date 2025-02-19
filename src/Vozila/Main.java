package Vozila;

import java.util.ArrayList;
import java.util.List;

/*
U glavnoj metodi (main) napravite ArrayList objekata klase Vozilo i:

Dodajte barem jedan Auto i jedan Bicikl.
Iterirajte kroz listu i pozovite kretanje() za svako vozilo.
 */
public class Main {
    public static void main(String[] args) {
        List<Vozilo> vozila = new ArrayList<>();

        vozila.add(new Automobil("Sivi", 150, 5));
        vozila.add(new Automobil("Crveni", 300, 2));
        vozila.add(new Bicikl("Crni", 50, "cestovni" ));
        vozila.add(new Bicikl("Žuti", 45, "cross trek" ));

        vozila.forEach( vozilo -> vozilo.kretanje());
    }
}
