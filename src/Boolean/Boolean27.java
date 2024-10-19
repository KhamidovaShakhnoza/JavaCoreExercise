package Boolean;

import java.util.Scanner;

public class Boolean27 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter  nonzero real numbers x and y :");
        double x =input.nextDouble();
        double y =input.nextDouble();
        boolean a=(x<0 && y>0) || (x<0 && y<0);
        System.out.println("The point with coordinates (x, y) is in the second or third coordinate quarter. Is it correct? "+a);

    }
}
