package com.github.thatnerdjack.watercooler;

/**
 * Created by block7 on 3/19/15.
 */
public class WaterCoolerMain {

    public static void main(String args[]) {
        WaterCooler cooler1 = null;

        try {
            cooler1 = new WaterCooler(100);
            WaterCooler cooler2 = new WaterCooler(-50);
        } catch (WaterCoolerException e) {
            System.out.println(e);
        }

        try {
            cooler1.getWater(-2);
        } catch (WaterCoolerException e) {
            System.out.println(e);
        }

        try {
            cooler1.getWater(150);
        } catch (WaterCoolerException e) {
            System.out.println(e);
        }
    }

}
