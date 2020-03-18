package com.company;

public class Emperor implements ForceSensitive, Sith {
    private double evilMeter;
    private double emperorPower;


    public Emperor() {
        evilMeter = 100;
    }

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        if (forceSensitive.howBigIsHisForce() < evilMeter) {
            return true;
        }
        return false;
    }

    @Override
    public double howBigIsHisForce() {
        return this.emperorPower;
    }

    @Override
    public void letOutYourWraith() {
        evilMeter += 50;
    }

    @Override
    public String toString() {
        return "Emperor{" +
                "evilMeter=" + evilMeter +
                '}';
    }
}
