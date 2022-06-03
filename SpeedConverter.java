package com.akilesh;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        long returnValue = -1;
        double milesPerHour;
        long roundedMilesPerHour;

        if(kilometersPerHour == 0) {
            returnValue = 0;
        }

        boolean isValuePositive = (kilometersPerHour >= 1) ? true : false;

        if(isValuePositive) {
            milesPerHour = kilometersPerHour / 1.609;
            roundedMilesPerHour = Math.round(milesPerHour);
            returnValue = roundedMilesPerHour;
        }

        return returnValue;
    }

    public static void printConversion(double kilometersPerHour) {
        int milesPerHour = Math.round(toMilesPerHour(kilometersPerHour));
        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else if(kilometersPerHour == 0) {
            System.out.println(0.0 + " km/h = " + 0 + " mi/h");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
