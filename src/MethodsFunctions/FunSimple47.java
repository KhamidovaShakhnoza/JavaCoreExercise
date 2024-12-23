package MethodsFunctions;

import java.util.Scanner;

public class FunSimple47 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers a,b,c,d:  ");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        int d= input.nextInt();
        System.out.println("Fraction of "+a+"/"+b+" = "+Frac1(a,b));
        System.out.println("Fraction of "+a+"/"+c+" = "+Frac1(a,c));
        System.out.println("Fraction of "+a+"/"+d+" = "+Frac1(a,d));
    }
    public static int EKUB(int a,int b){
        int r;
        int k=1;
        if (a>b) {
            while (k>0) {
                k = a % b;
                a = b;
                b = k;
            }
            r=a;
        }
        else  {
            while (k>0) {
                k = b % a;
                b = a;
                a = k;
            }
            r=b;
        }
        return r;
    }
    public static String Frac1(int a,int b){
        int p;
        int q;
        p=a/EKUB(a, b);
        q=b/EKUB(a, b);
        return p+"/"+q;

    }
}
