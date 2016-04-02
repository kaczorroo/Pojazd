package com.company;

/**
 * Created by ced on 2016-04-02.
 */
public class Autobus extends Pojazd{

    private String rodzaj;

    public Autobus(final String kolor, final String czyDziala, final String rodzaj) {
        super(kolor, czyDziala);
        this.rodzaj = rodzaj;
    }
    public String getSzyny() {
        return rodzaj;
    }

    @Override
    public String go() {
        return "Autobus";
    }
}

