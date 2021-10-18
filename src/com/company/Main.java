package com.company;

public class Main {

    public static void main(String[] args) {
        Benutzer eu =new Benutzer("Mihnea","Aleman");
        eu.add_sport(new Basketball());
        eu.add_sport(new Fussball());
        System.out.println(eu.kalkuliereZeit());
        System.out.println(eu.kalkuliereZeit(new Basketball()));
        System.out.println(eu.kalkuliereDurchschnitt());

    }
}
