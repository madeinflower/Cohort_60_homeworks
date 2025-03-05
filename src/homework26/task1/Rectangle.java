package homework26.task1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(String name) {
        super(name);
    }

    public void setDimensions(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void calculateArea() {
        double area = width * height;
        System.out.println("Area of rectangle: " + area);
    }
}

