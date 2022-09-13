package Polymorphism;

class Hatchback extends Car{
    public Hatchback(String name, int Cylinderr) {
        super(name, Cylinderr);
    }

    @Override
    public String startEngine() {
        return "Engine has started for Hatchback";
    }

    @Override
    public String accelerate() {
        return "acceleration for Hatchback";
    }

    @Override
    public String brake() {
        return "Braking for Hatchback";
    }
}