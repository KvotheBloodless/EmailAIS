package au.com.venilia.emailais.signalk.util;

import static java.lang.Math.PI;

public class Converter {

    public static int radianToDegrees(final double radians) {

        return (int) (radians * 180 / PI);
    }

    public static double metersPerSecondToKnots(final double metersPerSecond) {

        return metersPerSecond * 1.9438445;
    }

    public static double roundToNDigits(double value, int nDigits) {

        return Math.round(value * (10 ^ nDigits)) / (double) (10 ^ nDigits);
    }

    protected Converter() {

        // static methods only
    }
}
