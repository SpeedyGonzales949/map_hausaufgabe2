package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {


    @Test
    void kalkuliereZeit() {
        Benutzer eu =new Benutzer("Aleman","Mihnea");
        assertEquals(eu.kalkuliereZeit(),0);

        //test for time neede to be spent for all selected sports
        eu.add_sport(new Basketball());
        eu.add_sport(new Fussball());
        assertEquals(eu.kalkuliereZeit(),120);

        eu.add_sport(new Hindernislauf());
        eu.add_sport(new Hochsprung());
        assertEquals(eu.kalkuliereZeit(),170);

    }

    @Test
    void testKalkuliereZeit() {
        Benutzer eu =new Benutzer("Aleman","Mihnea");

        //test for the cases where there are no sports
        assertEquals(eu.kalkuliereZeit(new Basketball()),0);
        assertEquals(eu.kalkuliereZeit(new Hindernislauf()),0);
        assertEquals(eu.kalkuliereZeit(new Hochsprung()),0);
        assertEquals(eu.kalkuliereZeit(new Fussball()),0);

        //test for the cases where there is at least one sport of each kind
        eu.add_sport(new Hindernislauf());
        eu.add_sport(new Hochsprung());
        eu.add_sport(new Fussball());
        eu.add_sport(new Basketball());
        assertEquals(eu.kalkuliereZeit(new Basketball()),55);
        assertEquals(eu.kalkuliereZeit(new Hindernislauf()),30);
        assertEquals(eu.kalkuliereZeit(new Hochsprung()),20);
        assertEquals(eu.kalkuliereZeit(new Fussball()),65);

        //test for the cases where there are at least two sports of each kind
        eu.add_sport(new Hindernislauf());
        eu.add_sport(new Hochsprung());
        eu.add_sport(new Fussball());
        eu.add_sport(new Basketball());
        assertEquals(eu.kalkuliereZeit(new Basketball()),110);
        assertEquals(eu.kalkuliereZeit(new Hindernislauf()),60);
        assertEquals(eu.kalkuliereZeit(new Hochsprung()),40);
        assertEquals(eu.kalkuliereZeit(new Fussball()),130);

    }

    @Test
    void kalkuliereDurchschnitt() {
        Benutzer eu =new Benutzer("Aleman","Mihnea");
        assertEquals(eu.kalkuliereDurchschnitt(),0);

        //test for the average time needed to be spent for each game
        eu.add_sport(new Hindernislauf());
        eu.add_sport(new Hochsprung());
        eu.add_sport(new Fussball());
        eu.add_sport(new Basketball());
        assertEquals(eu.kalkuliereDurchschnitt(),42.5);
    }
}