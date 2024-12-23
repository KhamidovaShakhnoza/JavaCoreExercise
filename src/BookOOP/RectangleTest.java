package BookOOP;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,40);
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println();
        Rectangle rectangle2=new Rectangle(3.5,35.9);
        System.out.println(rectangle2);
        System.out.println(rectangle2.getArea());
        System.out.println(rectangle2.getPerimeter());
    }
}
