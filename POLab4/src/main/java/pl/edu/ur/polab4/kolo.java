/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class kolo {

    double promien;

    public kolo(double promien) {
        this.promien = promien;
    }

    public double obwodKoła() {
        double wynik;
        wynik = 2 * Math.PI * promien;
        return wynik;
    }

    public double poleKoła() {
        double wynik;
        wynik = Math.PI * Math.pow(promien, 2);
        return wynik;
    }

    public void wypisanieKoło() {
        System.out.println("Promień : " + promien);
        System.out.println("Pole : " + poleKoła());
        System.out.println("Obwód: " + obwodKoła());
    }

}
