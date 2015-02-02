package lux.physics;

import lux.util.Vector;

import java.util.List;

public abstract class Entity {

    protected Vector position, velocity, acceleration;
    protected double mass;
    protected List<Force> forces;

    public void accelerate(Time delta) {
        acceleration = Vector.sum((Force[])forces.toArray());
        velocity.add(Vector.scale(acceleration, delta.get()));
    }

    public void displace(Time delta) {
        position.add(Vector.scale(velocity, delta.get()));
    }
}
