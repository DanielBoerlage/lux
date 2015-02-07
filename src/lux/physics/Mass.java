package lux.physics;

public class Mass {

    private double mass;

    public Mass(double mass) {
        this.mass = mass;
    }

    public double get() {
        return mass;
    }

    public void set(double mass) {
        this.mass = mass;
    }

    public void add(double delta) {
        mass += delta;
    }
}
