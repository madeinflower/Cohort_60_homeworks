package homework26.task1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle");
        rectangle.setDimensions(5.0, 3.0);
        rectangle.setColor("Red");
        rectangle.displayInfo();
        rectangle.calculateArea();

        Circle circle = new Circle("Circle");
        circle.setRadius(4.0);
        circle.setColor("Blue");
        circle.displayInfo();
        circle.calculateArea();
    }
}
