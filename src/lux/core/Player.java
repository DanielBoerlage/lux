package lux.core;

import lux.physics.Entity;
import lux.util.Direction;
import lux.physics.GravityField;
import lux.physics.Mass;

public class Player extends Entity {

    Direction facing;

    public Player(Mass mass, GravityField gravityField) {
        super(mass, gravityField);
    }
}
