package edu.eci.cvds.tdd.registry;

import java.util.ArrayList;

public class Registry {
    public static ArrayList<Integer> personasRegistradas = new ArrayList<Integer>();
    public RegisterResult registerVoter(Person p) {

        Valid valid = new Valid();
        Duplicated duplicated = new Duplicated(valid);
        InvalidAge invalidAge = new InvalidAge(duplicated);
        Underage underage = new Underage(invalidAge);
        Dead dead = new Dead(underage);


        return dead.evalVoter(p);
    }
}