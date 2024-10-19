package IfConditions;

import java.util.Scanner;

public class If27 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        double x= input.nextInt();
        if (x<0){
            double f=0;
            System.out.println("F(x)="+f);
        }else if(x%2!=1){
            double f=1;
            System.out.println("F(x)="+f);
        }else if(x%2!=0){
            double f=-1;
            System.out.println("F(x)="+f);
        }
    }
}
