package Osoba;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var o = new Osoba();
        var a = new Apsolvent();

        a.getMatBrojStudenta();

        var s = new Osoba.Student();
        s.getMatBrojStudenta();
        a.getOib();
        s.getOib();

        var p = new Profesor();
        p.getOib();

        List<Osoba.Student> studenti = new ArrayList<>();
        studenti.add(a);
        studenti.add(s);

        List<Osoba> osobe = new ArrayList<>();
        osobe.add(s);
        osobe.add(a);
        osobe.add(p);
        osobe.add(o);

        osobe.forEach(osoba -> osoba.getOib());
        studenti.forEach(student -> student.getMatBrojStudenta());
        p.ocijeni();
    }
}