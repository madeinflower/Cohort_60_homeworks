package homework26.task1;

public class Circle extends Shape {
    double radius;

    public Circle(String name) {
        super(name);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}
