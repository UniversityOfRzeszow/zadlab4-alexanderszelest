/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class kwadrat {

    double bok;

    public kwadrat(double bok) {
        this.bok = bok;
    }

    public double obwódKwadratu() {
        double wynik;
        wynik = 4 * bok;
        return wynik;
    }

    public double poleKwadratu() {
        double wynik;
        wynik = bok * bok;
        return wynik;
    }

    public void wypisanieKwadra() {
        System.out.println("Bok : " + bok);
        System.out.println("Obwód : " + obwódKwadratu());
        System.out.println("Pole : " + poleKwadratu());

    }

}
