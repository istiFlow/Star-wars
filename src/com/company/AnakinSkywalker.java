package com.company;

import java.util.Random;

public class AnakinSkywalker extends AbstractJedi implements Sith {

    public AnakinSkywalker() {
        super(150.0, true);
    }

    @Override
    public void letOutYourWraith() {
        Random random = new Random();
        double powerIncrease = random.nextDouble() * 10;
        this.setForce(this.getForce() + powerIncrease);
    }

    @Override
    public boolean createBalance() {
        return (getForce() > 1000);
    }

    @Override
    public String toString() {
        return "AnakinSkywalker{power: " + getForce() + ", canTurn: " + isCanTurn();
    }
}
