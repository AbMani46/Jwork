/**
 * 
 * No.33,
 * @Circle now extends
 * 
 *  @GeometricObject
 */

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.color = color;
        this.radius = radius;
        this.filled = filled;

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    void printCircle() {
        System.out.println("Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]");
    }

}
