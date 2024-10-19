package Boolean;

import java.util.Scanner;

public class Boolean33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer numbers a, b and c :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean m = a+b>c && b+c>a && a+c>b;
        System.out.println( "A triangle with the sides a, b, c exists. Is it correct? "+m);
    }
}
