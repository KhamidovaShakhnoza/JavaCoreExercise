package BookOOP;

public class RegularPolygonTest {
    public static void main(String[] args) {
        RegularPolygon rp1 = new RegularPolygon();
        System.out.println(rp1);
        System.out.println(rp1.printInfo());
        RegularPolygon rp2 = new RegularPolygon(6,4);
        System.out.println(rp2);
        System.out.println(rp2.printInfo());
        RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(rp3);
        System.out.println(rp3.printInfo());


    }
}
