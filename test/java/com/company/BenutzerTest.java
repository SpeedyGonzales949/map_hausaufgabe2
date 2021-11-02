package com.company;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class BenutzerTest {


    @Test
    void kalkuliereZeit_ofAllSports() {
        Benutzer benutzer =new Benutzer("Aleman","Mihnea");
        assertEquals(benutzer.kalkuliereZeit(),0);

        //test for time needed to be spent for all selected sports
        benutzer.add_sport(new Basketball());
        benutzer.add_sport(new Fussball());
        assertEquals(benutzer.kalkuliereZeit(),120);


        benutzer.add_sport(new Hindernislauf());
        benutzer.add_sport(new Hochsprung());
        assertEquals(benutzer.kalkuliereZeit(),170);

    }


    @Test
    void testKalkuliereZeit_ofASpecificSport() {
        Benutzer benutzer =new Benutzer("Aleman","Mihnea");

        //test for the cases where there are no sports
        assertEquals(benutzer.kalkuliereZeit(new Basketball()),0);
        assertEquals(benutzer.kalkuliereZeit(new Hindernislauf()),0);
        assertEquals(benutzer.kalkuliereZeit(new Hochsprung()),0);
        assertEquals(benutzer.kalkuliereZeit(new Fussball()),0);

        //test for the cases where there is at least one sport of each kind
        benutzer.add_sport(new Hindernislauf());
        benutzer.add_sport(new Hochsprung());
        benutzer.add_sport(new Fussball());
        benutzer.add_sport(new Basketball());
        assertEquals(benutzer.kalkuliereZeit(new Basketball()),55);
        assertEquals(benutzer.kalkuliereZeit(new Hindernislauf()),30);
        assertEquals(benutzer.kalkuliereZeit(new Hochsprung()),20);
        assertEquals(benutzer.kalkuliereZeit(new Fussball()),65);

        //test for the cases where there are at least two sports of each kind
        benutzer.add_sport(new Hindernislauf());
        benutzer.add_sport(new Hochsprung());
        benutzer.add_sport(new Fussball());
        benutzer.add_sport(new Basketball());
        assertEquals(benutzer.kalkuliereZeit(new Basketball()),110);
        assertEquals(benutzer.kalkuliereZeit(new Hindernislauf()),60);
        assertEquals(benutzer.kalkuliereZeit(new Hochsprung()),40);
        assertEquals(benutzer.kalkuliereZeit(new Fussball()),130);

    }

    @Test
    void kalkuliereDurchschnitt() {
        Benutzer benutzer =new Benutzer("Aleman","Mihnea");
        assertEquals(benutzer.kalkuliereDurchschnitt(),0);

        //test for the average time needed to be spent for each game
        benutzer.add_sport(new Hindernislauf());
        benutzer.add_sport(new Hochsprung());
        benutzer.add_sport(new Fussball());
        benutzer.add_sport(new Basketball());
        assertEquals(benutzer.kalkuliereDurchschnitt(),42.5);
    }
}