abstract class Shape {
    abstract double area();
    abstract double perimeter();

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return 3.14 * radius * radius;
    }

    double perimeter() {
        return 2 * 3.14 * radius;
    }
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }

    double perimeter() {
        return 2 * (length + width);
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Circle c = new Circle(4.0);
        System.out.println("Circle Details:");
        c.display();

        System.out.println();
        Rectangle r = new Rectangle(5.0, 3.0);
        System.out.println("Rectangle Details:");
        r.display();
    }
}

