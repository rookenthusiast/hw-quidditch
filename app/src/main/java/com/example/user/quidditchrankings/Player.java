package com.example.user.quidditchrankings;

/**
 * Created by user on 12/12/2016.
 */
public class Player {

    String name;
    String house;

    public Player(String name, String house) {
        this.name = name;
        this.house = house;
    }


    public String getName() {
        return this.name;
    }

    public String getHouse() {
        return this.house;
    }

    public String setName(String name){
        return this.name = name;
    }

    public String setHouse(String house){
       return this.house = house;
    }
}