package IfConditions;

import java.util.Scanner;

public class If26 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        double x= input.nextInt();
        if (x<=0){
            double f=-x;
            System.out.println("F(x)="+f);
        }else if(x>0 && x<2){
            double f=x*x;
            System.out.println("F(x)="+f);
        }else{
            double f=4;
            System.out.println("F(x)="+f);
        }
    }
}
