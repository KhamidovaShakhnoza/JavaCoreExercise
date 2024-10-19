package Boolean;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter real numbers A (A is not equal to 0), B and C :");
        double A =input.nextDouble();
        double B =input.nextDouble();
        double C =input.nextDouble();
        double D = Math.pow(B, 2)-4*A*C;
        boolean a = D>0;
        System.out.println("The quadratic equation A·x2 + B·x + C = 0 has real roots. Is it correct? " +a);
    }
}
