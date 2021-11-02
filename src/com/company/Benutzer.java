package com.company;

import java.util.ArrayList;


public class Benutzer {

    private String          name;
    private String          vorname;
    public ArrayList<Sport> sports;


    public Benutzer(String name,String vorname){
        this.name=name;
        this.vorname=vorname;
        this.sports= new ArrayList<>();
    }


    public ArrayList<Sport> getSports() {
        return sports;
    }


    public String getName() {
        return name;
    }


    public String getVorname() {
        return vorname;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setSports(ArrayList<Sport> sports) {
        this.sports = sports;
    }


    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * adds a new type of sport to the list
     * @param sport, which will be added to the list
     *
     */
    public void add_sport(Sport sport){
        sports.add(sport);
    }

    /**
     * calculates the time needed to be spent for all the sports
     * @return time spent
     *
     */
    public double kalkuliereZeit(){
        double time = 0;

        for (Sport sport:
             sports
             ) {
            time=time+sport.kalkuliereZeit();
        }
        return time;
    }

    /**
     * calculates the time needed to be spent for specific sport
     * @param chosen_sport
     * @return time spent
     *
     */
    public double kalkuliereZeit(Sport chosen_sport){
        double time = 0;

        for (Sport sport:
                sports
        ) {
            if(chosen_sport.getClass() == sport.getClass()) /* check if its the same class */
                time=time+sport.kalkuliereZeit(); /* add to the sum*/
        }
        return time;
    }

    /**
     * calculates the average time spent for each sport
     * @return time spent
     *
     */
    public double kalkuliereDurchschnitt(){
        double time=0;
        for (Sport sport:
                sports
        ) {
            time=time+sport.kalkuliereZeit();/* add to the sum*/
        }
        if(this.sports.size()==0) /* special case (division by 0) */
            return 0;
        time = time/this.sports.size();
        return time;
    }


}
