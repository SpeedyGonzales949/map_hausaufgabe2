package com.company;

public class Main {

    public static void main(String[] args) {
        Benutzer mihnea =new Benutzer("Mihnea","Aleman");
        mihnea.add_sport(new Basketball());
        mihnea.add_sport(new Fussball());
        System.out.println(mihnea.kalkuliereZeit());
        System.out.println(mihnea.kalkuliereZeit(new Basketball()));
        System.out.println(mihnea.kalkuliereDurchschnitt());

    }
}
