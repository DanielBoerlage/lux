package lux.util;

import static lux.util.Utils.*;

public class Direction extends Vector {

    public Direction() {
        super();
    }

    public void rotateY(double delta) {
        double r = 1;
        double newAngle = bindRange(xyAngle() + delta, -HALF_PI, HALF_PI);

        x = Math.cos(newAngle);
        y = Math.sin(newAngle);
        //z doesnt change?
    }

    public void rotateZ(double delta) {

    }
}
