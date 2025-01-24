package BookOOP.Ch10.Ex12;

public class Test {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        System.out.println(t1);
        MyPoint m1=new MyPoint(1,1);
        MyPoint m2=new MyPoint(5,5);
        MyPoint m3=new MyPoint(4,8);
        Triangle t2 = new Triangle(m1,m2,m3);
        System.out.println(t2);
        System.out.println(t2.getArea());
        System.out.println(t1.getPerimeter());


    }
}
