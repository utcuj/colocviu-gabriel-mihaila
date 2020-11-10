package com.gabi.colocviu;

public class Companie {
    private String nume;
    private String[] sucursale= new String[3];

    public Companie() {
        this.nume="Helicopter City";
        this.sucursale[0]="Sibiu";
        this.sucursale[1]="Cluj";
        this.sucursale[2]="Brasov";
    }

    public String toString(){
        return "Nume companie: " + nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String[] getSucursale() {
        return sucursale;
    }

    public void setSucursale(String[] sucursale) {
        this.sucursale = sucursale;
    }
}
