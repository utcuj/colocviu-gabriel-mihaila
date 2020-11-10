package com.gabi.colocviu;

import java.awt.*;
import java.util.Scanner;

public class TestElicopter {
    public static void main(String[] args) {
        int nr_elicoptere;

        Scanner input=new Scanner(System.in);
        System.out.println("Dati nr de elicoptere: ");
        nr_elicoptere=input.nextInt();
        System.out.println("Numarul total de elicoptere este: " + nr_elicoptere + "\n");

        Companie companie=new Companie();
        System.out.println(companie.toString());
        System.out.println("Sucursale disponibile:");
        for(String sucursala:companie.getSucursale()){
            if(sucursala!=null){
                System.out.println(sucursala);
            }
            else
                break;
        }

        System.out.println();

        Elicopter[] elicopters= new Elicopter[nr_elicoptere];
        elicopters[0]=new Elicopter("Airbus 56",Color.DARK_GRAY,1999,"Sibiu",0);
        elicopters[1]=new Elicopter("Lufthansa 22",Color.GRAY,2001,"Sibiu",0);
        elicopters[2]=new Elicopter("WIZZ 10",Color.DARK_GRAY,1996,"Cluj",0);
        elicopters[3]=new Elicopter("Airbus 77",Color.GRAY,2004,"Sibiu",0);
        elicopters[4]=new Elicopter("WIZZ 1",Color.DARK_GRAY,1980,"Brasov",0);
        elicopters[5]=new Elicopter("Blue Air 33",Color.GRAY,1995,"Cluj",0);
        elicopters[6]=new Elicopter("Airbus 100",Color.DARK_GRAY,2015,"Brasov",0);
        elicopters[7]=new Elicopter("Airbus 101",Color.DARK_GRAY,2019,"Brasov",0);

        Manager mng1=new Manager("Gabi",35,"Sibiu");
        Manager mng2=new Manager("Tudor",40,"Cluj");
        Manager mng3=new Manager("Liviu",44,"Brasov");

        //adaugarea elicopterelor in sucursalele corespunzatoare
        for(Elicopter e:elicopters){
            if(e!=null){
                if(e.getSucursala().equals(mng1.getSucursala())){
                    mng1.adaugaElicoptere(e);
                }
            }
            else
                break;

        }
        System.out.println("***Managerul "+mng1.getNume()+" detine avioanele cu urm specificatii:\n");
        mng1.listElicoptere();

        for(Elicopter e:elicopters){
            if(e!=null){
                if(e.getSucursala().equals(mng2.getSucursala())){
                    mng2.adaugaElicoptere(e);
                }
            }
            else
                break;

        }
        System.out.println("***Managerul "+mng2.getNume()+" detine avioanele cu urm specificatii:\n");
        mng2.listElicoptere();

        for(Elicopter e:elicopters){
            if(e!=null){
                if(e.getSucursala().equals(mng3.getSucursala())){
                    mng3.adaugaElicoptere(e);
                }
            }
            else
                break;

        }
        System.out.println("***Managerul "+mng3.getNume()+" detine avioanele cu urm specificatii:\n");
        mng3.listElicoptere();

        if(elicopters[6].getSucursala().equals(mng3.getSucursala())){
            mng3.stergeElecoptere(elicopters[6]);
        }

        System.out.println("***Managerul "+mng3.getNume()+" detine, dupa metoda stergere, avioanele cu urm specificatii:\\n");
        mng3.listElicoptere();

        Client[] clients=new Client[5];
        clients[0]=new Basic("Marius",1,"Sibiu");
        clients[1]=new Basic("Tibi",1,"Cluj");
        clients[2]=new Premium("Siri",2,"Brasov");
        clients[3]=new Guru("Dan",2,"Sibiu");

        System.out.print("Avioanele inainte de inchiriere: ");
        for(Elicopter e:elicopters){
            if(e!=null){
                if(e.getInchiriat()==0)
                    System.out.print(e.getNume() + ", ");
            }
            else
                break;
        }

        System.out.println();
        System.out.println();

        //analog pentru vizualizare
        for(Client c:clients){
            if( (c instanceof Basic) || c instanceof Premium){
                if(c.getSucursala().equals(elicopters[0].getSucursala()))
                {
                    if(elicopters[0].getInchiriat()==0){
                        c.imprumuta(elicopters[0]);
                        int pret=c.calculPret(c.getNivel());
                        System.out.println("Clientul "+ c.getNume() + " a imprumutat elicopterul cu urmatoarele detalii:");
                        System.out.println(elicopters[0].toString());
                        System.out.println("Pretul inchirierii: "+ pret);
                    }
                    else{
                        System.out.println("Avionul este deja inchiriat!");
                    }

                }
                else
                    System.out.println("Clientul "+ c.getNume() + " nu a imprumutat elicopterul, nu se afla in aceasi sucursala");
            }
            else
                if(elicopters[3].getInchiriat()==0){
                    int pret=c.calculPret(c.getNivel());
                    c.imprumuta(elicopters[3]);
                    System.out.println("Clientul "+ c.getNume() + " a imprumutat elicopterul cu urmatoarele detalii:");
                    System.out.println(elicopters[3].toString());
                    System.out.println("Pretul inchirierii: "+ pret);
                }
                else{
                    System.out.println("Avionul este deja inchiriat!");
            }

        }

        System.out.print("Avioanele dupa inchiriere: ");
        for(Elicopter e:elicopters){
            if(e!=null){
                if(e.getInchiriat()==1)
                    System.out.print(e.getNume() + ", ");
            }
            else
                break;
        }


        for(Client c:clients){
            if(c!=null){
                if(c instanceof Guru){
                    System.out.println("\n\nClientul guru "+c.getNume()+ " vizualizeaza elicoptere:");
                    for(Elicopter e:elicopters){
                        if(e!=null){
                            System.out.println(e.toString());
                        }
                        else
                            break;
                    }
                }
            }
            else
                break;
        }



    }
}
