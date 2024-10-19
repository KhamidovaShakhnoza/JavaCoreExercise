package IfConditions;

import java.util.Scanner;

public class If24 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        double x= input.nextInt();
        if (x>0){
            double f=2*Math.sin(x);
            System.out.println("F(x)="+f);
        }else{
            double f=6-x;
            System.out.println("F(x)="+f);
        }
    }
}
