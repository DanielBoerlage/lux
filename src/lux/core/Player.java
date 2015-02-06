package lux.core;

import lux.physics.Entity;
import lux.util.Direction;

public class Player extends Entity {

    Direction facing;

    public Player(double mass) {
        super(mass);
    }
}
