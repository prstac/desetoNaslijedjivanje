package Ucilica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Omogućite sortiranje geometrijskih likova prema specifikaciji (po površini uzlazno).
//Implementirajte novu klasu Ucilica, koja će sadržavati kolekciju generiranih geometrijskih likova.
//Demonstrirajte sve funkcionalnosti.

public class Ucilica {
    private final List<GeometrijskiLik> likovi = new ArrayList<>();
    public List<GeometrijskiLik> getLikovi() {
        return likovi;
    }

    Ucilica() {
        dodajInicijalneLikove();
    }

    private void dodajInicijalneLikove() {
        likovi.add(new Trokut("trokut1", 1,1.5,2));
        likovi.add(new Pravokutnik("pravokutnik1", 2,3));
        likovi.add(new Krug("krug1", 1));
        ispisiSveLikove("Inicijalni likovi su: ");

    }

    public void unosLikovaIzKonzole() {
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

        ispisiSveLikove("Svi uneseni likovi su:");
    }


    public void sortirajLikovePoPovrsini() {
        Collections.sort(likovi);
        ispisiSveLikove("Likovi sortirani po povrsini: ");
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

    public void ispisiSveLikove(String message) {
        System.out.println(message);

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
