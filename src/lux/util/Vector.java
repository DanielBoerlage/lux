package lux.util;

import java.util.List;

public class Vector {

    public double x, y, z;

    public Vector() {
        x = y = z = 0;
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector(Vector copyFrom) {
        this(copyFrom.x, copyFrom.y, copyFrom.z);
    }

    public void add(Vector v) {
        x += v.x;
        y += v.y;
        z += v.z;
    }

    public Vector scale(double d) {
        return new Vector(x * d, y * d, z * d);
    }

    public static Vector plus(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector sum(List<Vector> vs) {
        Vector out = new Vector();
        for(Vector v : vs)
            out.add(v);
        return out;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
    }

    public String direction() {
        double magX = Math.abs(x);
        double magY = Math.abs(y);
        double magZ = Math.abs(z);

        if(magX == 0 && magY == 0 && magZ == 0)
            return "ZERO";
        if(magX > magY && magX > magZ) {
            if(x > 0)
                return "EAST (+x)";
            return "WEST (-x)";
        }
        if(magZ > magX && magZ > magY) {
            if(z > 0)
                return "SOUTH (+z)";
            return "NORTH (-z)";
        }
        if(y > 0)
            return "UP (+y)";
        return "DOWN (-y)";

    }

    public String toString() {
        return String.format("%4.3f", magnitude()) + " " + direction();
    }
}
