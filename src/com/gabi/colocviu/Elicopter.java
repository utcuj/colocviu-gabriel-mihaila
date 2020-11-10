package com.gabi.colocviu;

import java.awt.*;

public class Elicopter {
    private String nume;
    private Color culoare;
    private int anul_fabricatiei;
    private String sucursala;
    private int inchiriat;

    public Elicopter(String nume, Color culoare, int anul_fabricatiei, String sucursala, int inchiriat) {
        this.nume = nume;
        this.culoare = culoare;
        this.anul_fabricatiei = anul_fabricatiei;
        this.sucursala = sucursala;
        this.inchiriat=inchiriat; //0 pt neinchiriat, 1 pt inchiriat
    }

    public String toString(){
        return "Nume elicopter: " + nume + "\nCuloare: " + culoare + "\nAnul fabricatiei: " + anul_fabricatiei + "\nSucursala: " + sucursala + "\nInchiriat: " + inchiriat + "\n";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public int getAnul_fabricatiei() {
        return anul_fabricatiei;
    }

    public void setAnul_fabricatiei(int anul_fabricatiei) {
        this.anul_fabricatiei = anul_fabricatiei;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }

    public int getInchiriat() {
        return inchiriat;
    }

    public void setInchiriat(int inchiriat) {
        this.inchiriat = inchiriat;
    }
}
