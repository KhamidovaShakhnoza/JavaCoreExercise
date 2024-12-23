package MethodsFunctions;

import java.util.Scanner;

public class FunSimple13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
SortDec3(a,b,c);
    }

    public static void SortDec3(int a, int b, int c) {
        if (a > b && a > c) {
            if (b > c) System.out.println("A=" + a + " B=" + b + " C=" + c);
            else System.out.println("A=" + a + " B=" + c + " C=" + b);
        } else if (b > a && b > c) {
            if (a > c) System.out.println("A=" + b + " B=" + a + " C=" + c);
            else System.out.println("A=" + b + " B=" + c + " C=" + a);

        } else if (c > a && c > b) {
            if (b > a) System.out.println("A=" + c + " B=" + b + " C=" + c);
            else System.out.println("A=" + c + " B=" + a + " C=" + b);
        }
    }
}
