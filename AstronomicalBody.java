package com.sjsu;

/**
 * Represents a general class for Asteroid, Planet, Star
 */
public class AstronomicalBody {

    /**
     * Mass of AstronomicalBody
     */
    double mass;

    /**
     * Name of AstronomicalBody
     */
    String name;

    /**
     * Constructor to initialise Object
     * @param mass
     * @param name
     */
    public AstronomicalBody (double mass, String name){
        this.mass = mass;
        this.name = name;
        }

    /**
     * Method indicating how the body rotates
     */
    void rotate(){
        System.out.println("Rotating around a star");

    }

}
