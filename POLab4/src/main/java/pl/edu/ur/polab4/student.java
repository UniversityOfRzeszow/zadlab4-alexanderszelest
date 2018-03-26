/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author xszel
 */
public class student {

    String imie;
    String nazwisko;
    String nazwa_specjalnosci;
    int nr_indeksu;
    int rok_studiow;
    private String nazwaspecjalnosci;

    public student(String imie, String nazwisko, String nazwa_specjalnosci, int nr_indeksu, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
    }

    public student(String imie, String nazwisko, String nazwa_specjalnosci, int nr_indeksu, int rok_studiow) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_indeksu = nr_indeksu;
        this.rok_studiow = rok_studiow;
    }

    public student(String imie, String nazwisko, String nazwa_specjalnosci, int nr_indeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
        this.nr_indeksu = nr_indeksu;
    }

    public student(String imie, String nazwisko, String nazwa_specjalnosci) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nazwa_specjalnosci = nazwa_specjalnosci;
    }

    public student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void podWybrany() {
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        this.imie = s.next();
        System.out.println("Podaj nazwisko: ");
        this.nazwisko = s.next();
        System.out.println("Podaj nr indeksu: ");
        this.nr_indeksu = s.nextInt();
        System.out.println("Podaj specjalnosc: ");
        this.nazwaspecjalnosci = s.next();
        System.out.println("Podaj rok studiow: ");
        this.rok_studiow = s.nextInt();
    }

    public void wyswietlDane() {
        System.out.println("Imie: " + imie);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("nr indeksu: " + nr_indeksu);
        System.out.println("nazwa specjalnosci: " + nazwaspecjalnosci);
        System.out.println("rok studiow: " + rok_studiow);
    }

}
