package com.company;

/**
 * Created by ced on 2016-04-02.
 */
public abstract class Pojazd {
    private String kolor;
    private String czyDziala;

    public Pojazd(final String kolor, final String czyDziala) {
        this.kolor = kolor;
        this.czyDziala = czyDziala;
    }

    public String getKolor() {
        return kolor;
    }

    public String getCzyDziala() {
        return czyDziala;
    }

    public abstract String go();

    @Override
    public String toString() {
        return "Pojazd{" +
                "kolor='" + kolor + '\'' +
                ", czyDziala='" + czyDziala + '\'' +
                '}';
    }
}
