/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class stozek {

    double promien, tworzaca, wysokosc;

    public stozek(double promien, double tworzaca, double wysokosc) {
        this.promien = promien;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }

    public double objętśćStożka() {
        double wynik;
        wynik = (1 / 3) * promien * promien * wysokosc * Math.PI;
        return wynik;
    }

    public double poleStożka() {
        double wynik;
        wynik = Math.PI * promien * (promien + tworzaca);
        return wynik;
    }

    public void wyswietlanieStożka() {
        System.out.println("Promień, tworząca i wysokość stożka wynoszą: " + promien + ", " + tworzaca + ", " + wysokosc);
        System.out.println("Objętość kuli wynosi: " + objętśćStożka());
        System.out.println("Pole stożka wynosi: " + poleStożka());

    }

}
