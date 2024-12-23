package MethodsFunctions;

import java.util.Scanner;

public class FunSimple40 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers x,e1,e2,e3:  ");
        double x= input.nextDouble();
        double e1= input.nextDouble();
        System.out.println("Exp(x,e1) is : "+Exp1(x,e1));
        double e2= input.nextDouble();
        System.out.println("Exp(x,e2) is : "+Exp1(x,e2));
        double e3= input.nextDouble();
        System.out.println("Exp(x,e3) is : "+Exp1(x,e3));
    }
    public static int Fact(int n){
        int s=1;
        for (int i = 1; i < n+1; i++) {
            s*=i;
        }
        return s;
    }
    public static double Exp1(double x,double e){
        double r=1;
        double s=1;
        for (int i = 1; r>e  ; i++) {
            r=Math.pow(x,i)/(Fact(i));
            s+=r;
        }
        return s;
    }
}
