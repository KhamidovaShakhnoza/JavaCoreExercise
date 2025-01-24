package BookOOP.Ch10.Ex4;

public class MyPointTest {
    public static void main(String[] args) {
        MyPoint myPoint1 = new MyPoint();
        MyPoint myPoint2 = new MyPoint(10,30.5);
        System.out.println(myPoint1);
        System.out.println(myPoint2);
        System.out.println(myPoint1.distance(myPoint1,myPoint2));

    }
}
