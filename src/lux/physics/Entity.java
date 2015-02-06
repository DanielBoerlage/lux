package lux.physics;

import lux.util.Vector;

import java.util.List;

import static lux.physics.GravityField.EARTH;

public abstract class Entity {

    protected Vector position, velocity, acceleration;
    protected double mass;
    protected List<Vector> forces;

    public Entity(double mass)  {
        this.mass = mass;
        forces.add(EARTH.fg(mass));
    }

    public void update(double delta) {
        velocity.add(Vector.sum(forces).scale(delta));
        position.add(velocity.scale(delta));
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }
}
