package Boolean;

import java.util.Scanner;

public class Boolean31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer numbers a, b and c :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean l= (a==b && b!=c) || (b==c && c!=a) || (a==c && c!=b);
        System.out.println("The triangle with sides a, b, c is isosceles. Is it correct? "+l);

    }
}
