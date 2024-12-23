package MethodsFunctions;

import java.util.Scanner;

public class FunSimple38 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers a,n,m,k:  ");
        int a= input.nextInt();
        int n= input.nextInt();
        System.out.println(n+" power of "+a+" is: "+Power2(a,n));
        int m= input.nextInt();
        System.out.println(m+" power of "+a+" is: "+Power2(a,m));
        int k= input.nextInt();
        System.out.println(k+" power of "+a+" is: "+Power2(a,k));
        
    }
    public static double Power2(double a, int n) {
        double r = 1;
        double m = 1;
        if (n == 0) r = 1.0;
        else if (n > 0) {
            for (int i = 1; i <= n; i++) {
                r *= a;
            }
        } else if (n < 0) {
            for (int i = 1; i <= Math.abs(n); i++) {
                m *= a;
                r = 1 / m;
            }
        }
        return r;
    }
}
