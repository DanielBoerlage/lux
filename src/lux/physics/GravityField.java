package lux.physics;

import lux.util.Vector;

public class GravityField {

    private Vector g;

    public GravityField(Vector g) {
        this.g = g;
    }

    public Force force(Mass mass) {
        return (Force)g.scale(mass.get());
    }
}


//friction
//wind
//air resistance
//elasticity
//magnitism
