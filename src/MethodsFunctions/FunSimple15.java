package MethodsFunctions;

import java.util.Scanner;

public class FunSimple15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        ShiftLeft(a,b,c);
    }
    public static void ShiftLeft(int a, int b,int c){
        int firsta=a;
        int firstb=b;
        b=c;
        a=firstb;
        c=firsta;
        System.out.println("a="+a+"; b="+b+"; c="+c);
    }
}
