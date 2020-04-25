package com.sjsu;

/**
 * Subclass of AstronomicalBody
 */
public class Star extends AstronomicalBody {
    /**
     * Initialises a new star
     * @param mass
     * @param name
     */
    public Star(double mass, String name) {
        super(mass, name);
    }

    /**
     * Overrides rotate method from parent class.
     */
    public void rotate() {
        System.out.println("Rotating around the center of a galaxy");
    }

    /**
     * Method checks if two star objects are equal. Stars are equal
     * their names and masses are the same. Returns true if equal.
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Star) {
            Star other = (Star) obj;
            return (this.name.equals(other.name) && this.mass == other.mass);
        }
        else
        return false;

    }
}