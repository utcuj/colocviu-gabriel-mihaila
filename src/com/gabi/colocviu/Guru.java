package com.gabi.colocviu;

public class Guru extends Client {

    @Override
    public int calculPret(int nivel) {
        int pret;
        if(nivel == 1){
            pret=100*72-300;
            return pret;
        }
        else
        if(nivel == 2){
            pret=100*72-400;
            return pret;
        }
        else
            return 0;
    }

    @Override
    public void vizualizeaza(Elicopter elicopter) {
        System.out.println(" se uita la elicoperul " + elicopter.getNume() + "\n");
    }

    @Override
    public void imprumuta(Elicopter elicopter) {
        elicopter.setInchiriat(1);
    }

    @Override
    public void returneaza(Elicopter elicopter) {
        elicopter.setInchiriat(0);
    }

    public Guru(String nume, int nivel, String sucursala) {
        super(nume, nivel, sucursala);
    }

    public Guru() {
        super();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
