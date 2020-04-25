package com.sjsu;

/**
 * Subclass of AstronomicalBody
 */
public class Asteroid extends AstronomicalBody{
    /**
     * Initialises an asteroid with no name
     * @param mass
     */
    public Asteroid(double mass){
        super(mass, " ");

    }

    /**
     *  Initialises an asteroid with name and mass
     * @param mass
     * @param name
     */
    public Asteroid(double mass, String name){
        super(mass, name);

    }
}
