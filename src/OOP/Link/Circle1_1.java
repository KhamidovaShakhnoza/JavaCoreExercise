package OOP.Link;

public class Circle1_1 {
    private double radius;
    private String color;
    Circle1_1(){
        radius=1.0;
        color="red";
    }
    Circle1_1(double radius){}

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
