/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class sieśćścian {

    double bok;

    public sieśćścian(double bok) {
        this.bok = bok;
    }

    public double objętośćSześcianu() {
        double wynik;
        wynik = Math.pow(bok, 3);
        return wynik;
    }

    public double poleSześcianu() {
        double wynik;
        wynik = 6 * bok * bok;
        return wynik;
    }

    public void wypisanieSześcianu() {
        System.out.println("Bok sześcianu wynosi: " + bok);
        System.out.println("Objętość sześcianu wynosi: " + objętośćSześcianu());
        System.out.println("Pole sześcianu wynosi: " + poleSześcianu());

    }

}
