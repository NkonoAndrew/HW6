package com.sjsu;

/**
 * Subclass of AstronomicalBody. Does not introduce new instance variables
 */
public  class Planet extends AstronomicalBody{
    public Planet(double mass, String name){
        super(mass, name);
    }
}