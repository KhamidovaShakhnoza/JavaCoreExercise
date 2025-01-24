package BookOOP.Ch10.Ex14;

public class Test {
    public static void main(String[] args) {
        MyDate d1=new MyDate();
        System.out.println(d1);
        System.out.println();
        MyDate d2=new MyDate(561555550000L);
        System.out.println(d2);
        System.out.println();
        MyDate d3=new MyDate(2005,07,25);
        System.out.println(d3);
    }
}
