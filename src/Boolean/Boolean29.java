package Boolean;

import java.util.Scanner;

public class Boolean29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter  real numbers x,y,x1,y1,x2 and y2  :");
        double x =input.nextDouble();
        double y =input.nextDouble();
        double x1 =input.nextDouble();
        double y1 =input.nextDouble();
        double x2 =input.nextDouble();
        double y2 =input.nextDouble();
        boolean a=(x1<x && x<x2) && (y2<y && y<y1);
        System.out.println( "The point (x, y) is inside of the rectangle whose left top vertex is (x1, y1), right bottom vertex is (x2, y2), and sides are parallel to coordinate axes. Is it correct? "+a);


    }
}
