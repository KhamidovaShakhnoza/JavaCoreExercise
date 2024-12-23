package OOP.Link;

public class Circle1_2 {
    private double radius;

    Circle1_2() {
        this.radius = 1.0;
    }
    Circle1_2(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle1_2{" +
                "radius=" + radius +
                '}';
    }
}
