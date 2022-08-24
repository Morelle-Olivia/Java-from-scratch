package inheritance;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if(length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}

class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }
}
