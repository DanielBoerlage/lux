package lux.physics;

import lux.util.Vector;

public class Force extends Vector {

    String name;

    public Force(String name, double x, double y, double z) {
        super(x, y, z);
        this.name = name;
    }

    public Force(String name) {
        super();
        this.name = name;
    }

    public String toString() {
        return "Force: " + name + " is " + String.format("%4.2f", magnitude()) + " " + direction();
    }
}
