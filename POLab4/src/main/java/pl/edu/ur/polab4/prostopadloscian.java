/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class prostopadloscian {

    double bokA, bokB, bokC;

    public prostopadloscian(double bokA, double bokB, double bokC) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
    }

    public double objętośćProstopadłościanu() {
        double wynik;
        wynik = bokA * bokB * bokC;
        return wynik;
    }

    public double poleProstpadłościanu() {
        double wynik;
        wynik = 2 * (bokA * bokB + bokB * bokC + bokA * bokC);
        return wynik;
    }

    public void wyswietlanieProstopadłościanu() {
        System.out.println("Boki: " + bokA + ", " + bokB + ", " + bokC);
        System.out.println("Objętość: " + objętośćProstopadłościanu());
        System.out.println("Pole: " + poleProstpadłościanu());

    }
}
