package MethodsFunctions;

import java.util.Scanner;

public class FunSimple28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c,d,e: ");
        int a= input.nextInt();
        System.out.println("is "+a+" prime? "+IsPrime(a));
        int b= input.nextInt();
        System.out.println("is "+b+" prime? "+IsPrime(b));
        int c= input.nextInt();
        System.out.println("is "+c+" prime? "+IsPrime(c));
        int d= input.nextInt();
        System.out.println("is "+d+" prime? "+IsPrime(d));
        int e= input.nextInt();
        System.out.println("is "+e+" prime? "+IsPrime(e));
    }
    public static boolean IsPrime(int n){
        boolean r=true;
        double l=0;
        for (int i = 2; i <n ; i++) {
            l=n%i;
            if (l==0) r=false;
        }
        return r;
    }
}
