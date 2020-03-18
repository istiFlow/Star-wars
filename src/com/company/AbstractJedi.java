package com.company;

public abstract class AbstractJedi implements ForceSensitive{
    private double force;
    private boolean canTurn;

    public AbstractJedi(double force, boolean canTurn) {
        this.force = force;
        this.canTurn = canTurn;
    }

    public abstract boolean createBalance();

    @Override
    public boolean canDefeat(ForceSensitive forceSensitive) {
        if (forceSensitive instanceof Emperor) {
            if (this.getForce() >= 2 * forceSensitive.howBigIsHisForce()) {
                return true;
            }
            return false;
        } else if (forceSensitive instanceof AbstractJedi) {
            if (this.getForce() > ((AbstractJedi) forceSensitive).getForce() && ((AbstractJedi) forceSensitive).canTurn) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public double howBigIsHisForce() {
        return this.force;
    }

    public double getForce() {
        return force;
    }

    public void setForce(double force) {
        this.force = force;
    }

    public boolean isCanTurn() {
        return canTurn;
    }

    public void setCanTurn(boolean canTurn) {
        this.canTurn = canTurn;
    }
}

