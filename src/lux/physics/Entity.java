package lux.physics;

import lux.util.Vector;

import java.util.List;

public abstract class Entity {

    protected Vector position, velocity, acceleration;
    protected double mass;
    protected List<Vector> forces;

    public Entity(double mass)  {
        this.mass = mass;
        forces.add(Gravity.force(this));
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
        // do some stuff or stuff so that it works better n stuff
    }
}
