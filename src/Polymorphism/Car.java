package Polymorphism;

public class Car {
    private String name;
    private boolean engine;
    private int Cylinder;
    private int wheels;

    public Car(String name, int Cylinder) {
        this.name = name;
        this.Cylinder = Cylinder;
        this.wheels = 4;
        this.engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinder() {
        return Cylinder;
    }

    public String startEngine() {
        return "Engine has started.";
    }

    public String accelerate() {
        return "Accelerating";
    }

    public String brake() {
        return "Braking";
    }
}

class Coupe extends Car{
    public Coupe(String name, int Cylinder) {
        super(name, Cylinder);
    }

    @Override
    public String startEngine() {
        return "Engine has started for coupe";
    }

    @Override
    public String accelerate() {
        return "acceleration for coupe";
    }

    @Override
    public String brake() {
        return "Braking for coupe";
    }
}