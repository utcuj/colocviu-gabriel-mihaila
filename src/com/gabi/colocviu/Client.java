package com.gabi.colocviu;

public abstract class Client {
    private String nume;
    private int nivel;
    private String sucursala;

    public Client(String nume, int nivel, String sucursala) {
        this.nume = nume;
        this.nivel = nivel;
        this.sucursala=sucursala;
    }

    public Client(){
        this("-",0,"-");
    }
    public abstract int calculPret(int nivel);
    public abstract void vizualizeaza(Elicopter elicopter);
    public abstract  void imprumuta(Elicopter elicopter);
    public abstract  void returneaza(Elicopter elicopter);


    public String toString(){
        return "Nume client: " + nume + "\nNivel:" + nivel + "\n";
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSucursala() {
        return sucursala;
    }

    public void setSucursala(String sucursala) {
        this.sucursala = sucursala;
    }
}
