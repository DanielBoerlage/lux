package lux.physics;

import lux.util.Vector;

public class Gravity {

    private static Vector GRAVITATIONAL_FIELD_CONSTANT = new Vector(0.0, -1.0, 0.0);

    /*public static Force force(Entity entity) {
        return new Force(){
            public double getX() {
                return entity.getMass() * GRAVITATIONAL_FIELD_CONSTANT.getX();
            }
            public double getY() {
                return entity.getMass() * GRAVITATIONAL_FIELD_CONSTANT.getY();
            }
            public double getZ() {
                return entity.getMass() * GRAVITATIONAL_FIELD_CONSTANT.getZ();
            }
        };

        //GRAVITATIONAL_FIELD_CONSTANT.scale(entity.getMass());
    }*/

    public static Force force(Entity entity) {
        return GRAVITATIONAL_FIELD_CONSTANT.scale(entity.getMass());
    }
}
