package com.github.thatnerdjack.watercooler;

/**
 * Created by block7 on 3/19/15.
 */
public class WaterCooler {
    private double maxVol;
    private double currentVol;

    public WaterCooler(double maxVol) throws WaterCoolerException {
        this.maxVol = maxVol;
        currentVol = 0;
        if(maxVol < 0)
            throw new WaterCoolerException("Max volume is not positive");
    }

    public boolean isEmpty() {
        return (currentVol == 0);
    }

    public double getWater(double takeAmount) throws WaterCoolerException {
        if(takeAmount < 0)
            throw new WaterCoolerException("Cannot get negative amount");
        if(takeAmount > currentVol)
            throw new WaterCoolerException("Current volume is lower than requested amount");
        currentVol -= takeAmount;
        return currentVol;
    }

    public void refill() {
        currentVol = maxVol;
    }
}
