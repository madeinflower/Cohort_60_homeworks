package homework26.task1;

public class Shape {
    String name;
    String color;

    public Shape(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Shape: " + name);
        if (color != null) {
            System.out.println("Color: " + color);
        }
    }

    public void setColor(String color) {
        this.color = color;
    }
}