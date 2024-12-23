package OOP.Link2;
import java.util.Arrays;

public class MyLinePointTest {
    public static void main(String[] args) {
        MyLine line1=new MyLine(2,3,8,9);
        System.out.println(line1);
        MyLinePoint begin=new MyLinePoint(1,1);
        MyLinePoint end=new MyLinePoint(2,2);
        MyLine line2=new MyLine(begin,end);
        System.out.println(line2);
        line2.setEnd(new MyLinePoint(3,3));
        System.out.println(line2);
        System.out.println("Begin coordinates: " + Arrays.toString(line2.getBeginXY()));
        System.out.println("End coordinates: " + Arrays.toString(line2.getEndXY()));

    }
    }

