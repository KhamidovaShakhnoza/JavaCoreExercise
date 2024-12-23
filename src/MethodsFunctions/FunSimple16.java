package MethodsFunctions;

import java.util.Scanner;

public class FunSimple16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a: ");
        int a = input.nextInt();
        System.out.println(Ishora(a));
    }
    public static double Ishora(double num){
        double r;
        if (num>0) r=1;
        else if (num<0) r=-1;
        else r=0;
        return r;
    }
}
