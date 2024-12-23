package MethodsFunctions;

import java.util.Scanner;

public class FunSimple17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        KvadratT(a,b,c);
    }
    public static void KvadratT(double a, double b,double c){
        double d=(b*b)-(4*a*c);
        if(d>0) System.out.println("2 ta ildizi bor");
        else if (d==0) System.out.println("1 ta ildizi bor");
        else System.out.println("Ildizi yo'q");


    }
}
