package MethodsFunctions;

import java.util.Scanner;

public class FunSimple11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int d= input.nextInt();
        Minmax(a,b);
        Minmax(b,c);
        Minmax(c,d);
        Minmax(d,a);
    }
    public static void Minmax(double x, double y) {
        if (x > y) {
            double firstx = x;
            x = y;
            y = firstx;
        }
        System.out.println("X="+x+"; Y="+y);
    }


}
