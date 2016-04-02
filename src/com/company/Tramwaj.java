package com.company;

/**
 * Created by ced on 2016-04-02.
 */
public class Tramwaj extends Pojazd {

    private String jaki;

    public Tramwaj(final String kolor, final String czyDziala, final String jaki) {
        super(kolor, czyDziala);
        this.jaki = jaki;
    }

    public String getJaki() {
        return jaki;
    }

    @Override
    public String go() {
        return "Tramwaj";
    }
}
