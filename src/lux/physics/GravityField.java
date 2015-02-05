package lux.physics;

import lux.util.Vector;

public class GravityField {

    public static final GravityField EARTH = new GravityField(new Vector(0.0, -9.8, 0.0));

    private Vector g;

    public GravityField(Vector g) {
        this.g = g;
    }

    public Vector fg(double mass) {
        return g.scale(mass);
    }
}


//friction
//wind
//air resistance
//elasticity
