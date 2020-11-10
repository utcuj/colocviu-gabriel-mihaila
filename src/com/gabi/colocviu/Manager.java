package com.gabi.colocviu;

public class Manager {
    private String nume;
    private int varsta;
    private String sucursala;
    private Elicopter[] elicoptere=new Elicopter[100];
    private int i=0;

    public Manager(String nume, int varsta, String sucursala) {
        this.nume = nume;
        this.varsta = varsta;
        this.sucursala = sucursala;
    }

    public String toString(){
        return "Nume manager: " + nume + "\nVarsta: " + varsta + "\nSucursala detinuta: " + sucursala + "\n";
    }

    public void adaugaElicoptere(Elicopter elicopter){
        elicoptere[i++]=elicopter;
    }

    public void stergeElecoptere(Elicopter elicopter){
        for(int ct=0;ct<i;ct++){
            if(elicoptere[ct].getNume().equals(elicopter.getNume())){
                for(int ct2=ct;ct2 < i-1;ct2++)
                    elicoptere[ct2]=elicoptere[ct2+1];
                i=i-1;
                break;
            }
        }
    }

    public void listElicoptere(){
        for(int ct=0;ct<i;ct++){
                System.out.println(elicoptere[ct].toString());

        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }

    public Elicopter[] getElicoptere() {
        return elicoptere;
    }

    public void setElicoptere(Elicopter[] elicoptere) {
        this.elicoptere = elicoptere;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
