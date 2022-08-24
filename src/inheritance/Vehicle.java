package inheritance;

public class Vehicle {
    private int steering;
    private int gears;
    private int speed;

    public Vehicle(int steering, int gears, int speed) {
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Cars extends Vehicle {
    public Cars(int steering, int gears, int speed) {
        super(steering, gears, speed);
    }
}

class Yaris extends Cars {
    private int spacious;

    public Yaris(int steering, int gears, int speed, int spacious) {
        super(steering, gears, speed);
        this.spacious = spacious;
    }
}
