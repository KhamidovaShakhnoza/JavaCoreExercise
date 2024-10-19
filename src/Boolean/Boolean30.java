package Boolean;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Boolean30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integer numbers a, b and c :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean l= a==b && b==c;
        System.out.println("The triangle with sides a, b, c is equilateral. Is it correct? "+l);


    }
}
