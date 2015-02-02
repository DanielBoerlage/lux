package lux.util;

import java.util.List;
import lux.physics.Force;

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
        x = copyFrom.x;
        y = copyFrom.y;
        z = copyFrom.z;
    }

    public Vector add(Vector v) {
        x += v.x;
        y += v.y;
        z += v.z;
        return this;
    }

    public static Vector plus(Vector v1, Vector v2) {
        return new Vector(v1.x + v2.x, v1.y + v2.y, v1.z + v2.z);
    }

    public static Vector sum(Vector... vs) {
        Vector out = new Vector();
        for(Vector v : vs)
            out.add(v);
        return out;
    }

    public static Vector scale(Vector v, double d) {
        return new Vector(v.x * d, v.y * d, v.z * d);
    }
}
