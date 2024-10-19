package IfConditions;

import java.util.Scanner;

public class If25 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        double x= input.nextInt();
        if (x>2 || x<-2){
            double f=2*x;
            System.out.println("F(x)="+f);
        }else{
            double f=-3*x;
            System.out.println("F(x)="+f);
        }
    }
}
