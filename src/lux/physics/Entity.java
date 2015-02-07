package lux.physics;

import lux.util.Vector;

import java.util.List;

public abstract class Entity {

    protected Vector position, velocity, acceleration;
    protected Mass mass;
    protected List<Force> forces;

    protected Force gravity;
    protected GravityField gravityField;

    public Entity(Mass mass, GravityField gravityField)  {
        this.mass = mass;
        this.gravityField = gravityField;
        forces.add(gravityField.force(mass));
    }

    public void update(double delta) {
        acceleration = Vector.sum(forces);
        velocity.add(acceleration.scale(delta));
        position.add(velocity.scale(delta));
    }

    public Mass getMass() {
        return mass;
    }

    public void addMass(double delta) {
        mass.add(delta);
        updateAll(mass);
    }

    public void updateAll(Object... objs) {
        for(Force force : forces)
            if(force.depends(objs))
                force = gravityField.force(mass);
    }
}
