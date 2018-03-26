/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xszel
 */
public class prostokat {

    double boka, bokb;

    public prostokat(double boka, double boka) {
        this.boka = boka;
        this.bokb = bokb;
    }

    public double obwódProstokąta() {
        double wynik;
        wynik = 2 * (boka + bokb);
        return wynik;
    }

    public double poleProstokąta() {
        double wynik;
        wynik = boka * bokb;
        return wynik;
    }

    public void wypisanieProstokąt() {
        System.out.println("Boki : " + boka + ", " + bokb);
        System.out.println("Obwód : " + obwódProstokąta());
        System.out.println("Pole: " + poleProstokąta());

    }

}
