package com.company;

import java.util.ArrayList;


public class Benutzer {

    private String          name;
    private String          vorname;
    public ArrayList<Sport> sports;

    /**
     *
     * @param name
     * @param vorname
     * desc:constructor
     */
    public Benutzer(String name,String vorname){
        this.name=name;
        this.vorname=vorname;
        this.sports= new ArrayList<>();
    }

    /**
     * @return
     */
    public ArrayList<Sport> getSports() {
        return sports;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String getVorname() {
        return vorname;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param sports
     */
    public void setSports(ArrayList<Sport> sports) {
        this.sports = sports;
    }

    /**
     *
     * @param vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     *
     * @param sport
     * desc:adds a new type of sport to the list
     */
    public void add_sport(Sport sport){
        sports.add(sport);
    }

    /**
     *
     * @return
     * desc:calculates the time needed to be spent for all the sports
     */
    public double kalkuliereZeit(){
        double s = 0;

        for (Sport sport:
             sports
             ) {
            s=s+sport.kalkuliereZeit();
        }
        return s;
    }

    /**
     *
     * @param s
     * @return
     * desc: calculates the time needed to be spent for specific sport
     */
    public double kalkuliereZeit(Sport s){
        double x = 0;

        for (Sport sport:
                sports
        ) {
            if(s.getClass() == sport.getClass()) /* check if its the same class */
            x=x+sport.kalkuliereZeit(); /* add to the sum*/
        }
        return x;
    }

    /**
     *
     * @return
     * desc:calculates the average time spent for each sport
     */
    public double kalkuliereDurchschnitt(){
        double x=0;
        for (Sport sport:
                sports
        ) {
                x=x+sport.kalkuliereZeit();/* add to the sum*/
        }
        if(this.sports.size()==0) /* special case (division by 0) */
            return 0;
        x = x/this.sports.size();
        return x;
    }


}
