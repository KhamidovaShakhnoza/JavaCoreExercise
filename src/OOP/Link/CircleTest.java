package OOP.Link;

public class CircleTest {
    public static void main(String[] args) {
        Circle1_1 circle1=new Circle1_1();
        System.out.println(circle1.getRadius());
        Circle1_1 circle2=new Circle1_1(2.5);
        circle2.setRadius(2.5);
        System.out.println(circle2.getRadius());
        System.out.println(circle1);
        System.out.println(circle2);
    }
}
