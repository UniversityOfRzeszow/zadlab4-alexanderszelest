/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class kula {

    double promien;

    public kula(double promien) {
        this.promien = promien;
    }

    public double objętośćKuli() {
        double wynik;
        wynik = (4 / 3) * Math.PI * Math.pow(promien, 3);
        return wynik;
    }

    public double poleKuli() {
        double wynik;
        wynik = 4 * Math.PI * Math.pow(promien, 2);
        return wynik;
    }

    public void wypisanieKula() {
        System.out.println("Promień: " + promien);
        System.out.println("Objętość : " + objętośćKuli());
        System.out.println("Pole : " + poleKuli());
    }

}
