package MethodsFunctions;

import java.util.Scanner;

public class FunSimple34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers a,b,c:  ");
        int a= input.nextInt();
        System.out.println("Factorial of "+a+" is: "+Fact(a));
        int b= input.nextInt();
        System.out.println("Factorial of "+b+" is: "+Fact(b));
        int c= input.nextInt();
        System.out.println("Factorial of "+c+" is: "+Fact(c));
    }
    public static int Fact(int n){
        int s=1;
        for (int i = 1; i < n+1; i++) {
            s*=i;
        }
        return s;
    }
}
