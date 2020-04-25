package com.sjsu;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a whole planetary system. Can include stars, asteroids and planets
 */
public class PlanetarySystem extends ArrayList<AstronomicalBody> {
    /**
     * Star of this particular planetary system.
     */
    Star star;

    /**
     * Add a start to the Planetary system if none is available
     * @param ab
     * @return
     */
    public boolean add(AstronomicalBody ab) {

        if (!(ab instanceof Star)) {
            super.add(ab);
            return true;
        } else {

            if (star == null) {
                super.add(ab);
                star = (Star) star;
                return true;
            } else {
                return false;
            }


        }
    }

    /**
     * Returns the Total mass of a planetary system from all the Astronomical
     * objects this planetary system has
     * @return
     */
    public double getTotalMass() {
        //initialise the total
        double total = 0;
        for (int i = 0; i < this.size(); i++) {
            total = this.get(i).mass;
        }
        return total;

    }

    /**
     * Checks whether two planetary systems are equal
     * Two planetary systems are equal if: their stars
     * their total masses are equal
     * their size is equal (i.e Number of added bodies in planetary system)
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PlanetarySystem) {
            PlanetarySystem other = (PlanetarySystem) obj;
             return (this.star.equals(other.star) && this.getTotalMass() == other.getTotalMass() && this.size() == other.size());
        }
        return false;
    }

    /**
     * Description of planetary system
     * @return
     */
    @Override
    public String toString() {
        String output = " ";
        for (int i = 0; i < this.size() ; i++) {
               output += "\nName:" + this.get(i).name + ", Mass: " + this.get(i).mass;

        }
        return output;

    }
}
