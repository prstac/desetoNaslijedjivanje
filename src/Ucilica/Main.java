package Ucilica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Učilica - Zadatak 1: https://prnt.sc/VoorGlglC4o1

Dobili ste projektni zadatak razviti konzolnu aplikaciju „Učilica”. Cilj te aplikacije je pomoći učenicima osnovne škole da lakše savladaju neke značajke osnovnih geometrijskih likova.
Geometrijski likovi koje ćemo pokriti su: Trokut, Krug i Pravokutnik
Trokut je definiran s 3 stranice
Kruge je definiran radijusom
Pravokutnik je definiran s 2 stranice
Svaki geometrijski lik ima svoj Naziv, i možemo mu izračunati Površinu i Opseg.
Aplikacija mora omogućiti unos novog geometrijskog lika.
Aplikacija mora moći ispisati sve površine i opsege kreiranih geometrijskih likova.
Aplikacija mora moći sortirati sve kreirane geometrijske likove po površini uzlazno.

ZADATAK 1 - 12.2.2025

Na osnovu opisa projektnog zadatka, pripremite i implementirajte potrebne klase za trokut, krug i pravokutnik.
 */

public class Main {
    private final List<GeometrijskiLik> likovi = new ArrayList<>();

    public static void main(String[] args) {
        Main program = new Main();

        program.dodajInicijalneLikove();

        program.unosLikovaIzKonzole();
        program.ispisiSveLikove();

        program.sortirajLikovePoPovrsini();
        program.ispisiSveLikove();
    }

    private void dodajInicijalneLikove() {
        likovi.add(new Trokut("trokut1", 1,1.5,2));
        likovi.add(new Pravokutnik("pravokutnik1", 2,3));
        likovi.add(new Krug("krug1", 1));
    }

    private void unosLikovaIzKonzole() {
        String linija = "";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Unos novog lika. Unesite ime te 1,2 ili 3 vrijednosti odvojene razmakom. Za prekid upisite kraj");
            linija = scanner.nextLine();
            if (linija.equals("kraj")) break;
            var unosiArray = linija.trim().split(" ");
            try {
                switch (unosiArray.length) {
                    case 2: {
                        unosKruga(unosiArray);
                        break;
                    }
                    case 3: {
                        unosPravokutnika(unosiArray);
                        break;
                    }
                    case 4: {
                        unosTrokuta(unosiArray);
                        break;
                    }
                    default:
                        System.out.println("neispravan unos");
                }
            } catch (NumberFormatException exception) {
                System.out.println("neispravan unos");
            }
        } while (true);
        scanner.close();
    }

    private void sortirajLikovePoPovrsini() {
        likovi.sort( (s1,s2) -> {
            double razlika = s1.povrsina() - s2.povrsina();
            int returnValue = 0;
            if (razlika > 0) returnValue = 1;
            else if (razlika < 0) returnValue = -1;
            return  returnValue;
        });
    }

    private void unosTrokuta(String[] unosi) {
        String ime = unosi[0];
        double a = Double.parseDouble(unosi[1]);
        double b = Double.parseDouble(unosi[2]);
        double c = Double.parseDouble(unosi[3]);

        likovi.add(new Trokut(ime, a, b, c));
    }

    private void unosPravokutnika(String[] unosi) {
        String ime = unosi[0];
        double a = Double.parseDouble(unosi[1]);
        double b = Double.parseDouble(unosi[2]);

        likovi.add(new Pravokutnik(ime, a, b));
    }

    private void unosKruga(String[] unosi) {
        String ime = unosi[0];
        double r = Double.parseDouble(unosi[1]);

        likovi.add(new Krug(ime, r));
    }

    public void ispisiSveLikove() {
        System.out.println("Svi likovi su: ");

        likovi.forEach(lik-> System.out.println(lik));

        System.out.println();
    }

    public void ispisiSveOpsege() {
        likovi.forEach(l -> System.out.println(l.opseg()));
    }

    public void ispisiSvePovrsine() {
        likovi.forEach(l -> System.out.println(l.povrsina()));
    }
}
