package com.company;

public class module6Classes {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Yorkie", 8, 20, 2,4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
