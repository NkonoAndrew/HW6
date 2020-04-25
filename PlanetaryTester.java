package com.sjsu;

public class PlanetaryTester {
    public static void main(String[] args) {
        Star sun =  new Star(10, "Sun");
        Star alderbaran = new Star(30, "Aderbaran");

        Planet earth = new Planet(195, "Earth");
        Planet abc = new Planet(44, "abc");

        Asteroid ceres = new Asteroid(42, "Ceres");

        Star sun2 = new Star(10, "Sun");

        System.out.println("Check if two stars are equal:" + sun.equals(sun2));
        sun.rotate();
        sun2.rotate();

        PlanetarySystem nkono = new PlanetarySystem();
        nkono.add(sun);
        nkono.add(alderbaran);
        nkono.add(earth);
        nkono.add(ceres);

        System.out.println(nkono.getTotalMass());

        PlanetarySystem andrew = new PlanetarySystem();
        andrew.add(sun);
        andrew.add(alderbaran);
        andrew.add(earth);
        andrew.add(ceres);

        System.out.println(nkono);
        System.out.println(andrew);

        System.out.println(nkono.equals(andrew));





    }
}
