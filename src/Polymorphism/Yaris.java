package Polymorphism;

class Yaris extends Car{
    public Yaris(String name, int Cylinder) {
        super(name, Cylinder);
    }

    @Override
    public String startEngine() {
        return "Engine has started for Yaris";
    }

    @Override
    public String accelerate() {
        return "acceleration for Yaris";
    }

    @Override
    public String brake() {
        return "Braking for Yaris";
    }
}

