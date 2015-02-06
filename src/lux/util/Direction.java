package lux.util;

import lux.util.Utils;

public class Direction extends Vector {

    public Direction() {
        super();  // this results in r of 0; change latter
    }

    public void rotateY(double delta) {
        double xzAngle = xzAngle();
        double yAngle = yAngle();
        x = Math.cos(xzAngle)*Math.cos(yAngle);
        z = Math.sin(xzAngle)*Math.cos(yAngle);
        y = Math.sin(yAngle);
    }

    public void rotateXZ(double delta) {
        double xzAngle = xzAngle();
        double yAngle = yAngle();
        x = Math.cos(xzAngle)*Math.cos(yAngle);
        z = Math.sin(xzAngle)*Math.cos(yAngle);
        y = Math.sin(yAngle);
    }

    public double yAngle() {
        return Math.atan2(y, Math.hypot(x, z));
    }

    public double xzAngle() {
        return Math.atan2(z, x);
    }
}
