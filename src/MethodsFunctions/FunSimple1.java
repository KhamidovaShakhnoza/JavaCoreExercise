package MethodsFunctions;

import java.util.Scanner;

public class FunSimple1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A :");
        double A= input.nextDouble();
        System.out.println("Power 3 of A is :"+powerA3(A));

        System.out.println("Enter B :");
        double B= input.nextDouble();
        System.out.println("Power 3 of B is :"+powerA3(B));

        System.out.println("Enter C :");
        double C= input.nextDouble();
        System.out.println("Power 3 of C is :"+powerA3(C));

        System.out.println("Enter D :");
        int D= input.nextInt();
        System.out.println("Power 3 of D is :"+powerA3(D));

        System.out.println("Enter E :");
        int E= input.nextInt();
        System.out.println("Power 3 of E is :"+powerA3(E));

    }
    public static double powerA3(double a){
        return  a*a*a;
    }
}
