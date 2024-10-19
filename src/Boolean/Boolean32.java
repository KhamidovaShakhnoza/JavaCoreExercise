package Boolean;

import java.util.Scanner;

public class Boolean32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer numbers a, b and c :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean l= (Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) || (Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)) || (Math.pow(a,2)+Math.pow(c,2)==Math.pow(b,2));
        System.out.println("The triangle with sides a, b, c is a right triangle. Is it correct? "+l);

    }
}
