package homework35.task2;

import homework35.task1.Rectangle;

public class Rectangle2 {

    private double length;
    private double width;

    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle2() {
        this.length = 1.0;
        this.width = 1.0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return Double.compare(length, other.getLength()) == 0 &&
                Double.compare(width, other.getWidth()) == 0;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        Rectangle rect2 = new Rectangle(5.0, 3.0);
        Rectangle rect3 = new Rectangle(2.0, 4.0);

        System.out.println("rect1 and rect2 are equal? " + rect1.equals(rect2)); // true
        System.out.println("rect1 and rect3 are equal? " + rect1.equals(rect3)); // false
        System.out.println("rect2 and rect3 are equal? " + rect2.equals(rect3)); // false
    }
}

