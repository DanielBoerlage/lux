package lux.util;

public class Utils {

    public static final double HALF_PI = Math.PI/2.0;

    public static double bindRange(double var, double min, double max) {
        return Math.min(Math.max(var, min), max);
    }

    public static double normalizeAngle(double angle) {
        if(angle < Math.PI && angle > -Math.PI)
    }

}
