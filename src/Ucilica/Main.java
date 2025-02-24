package Ucilica;

import java.util.ArrayList;
import java.util.Collections;
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

    public static void main(String[] args) {
        Ucilica ucilica = new Ucilica();
        ucilica.unosLikovaIzKonzole();
        ucilica.sortirajLikovePoPovrsini();
    }

}
