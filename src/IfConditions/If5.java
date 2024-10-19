package IfConditions;

import java.util.Scanner;

public class If5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        System.out.println("Enter b : ");
        int b= input.nextInt();
        System.out.println("Enter c : ");
        int c= input.nextInt();
        int positiveCount=0;
        int negativeCount=0;
        if (a>0)  {
            positiveCount++;
        }else if(a<0){
            negativeCount++;
        }
        if (b>0)  {
            positiveCount++;
        }else if(b<0){
            negativeCount++;
        }
        if (c>0)  {
            positiveCount++;
        }else if(c<0){
            negativeCount++;
        }
        System.out.println(positiveCount +" of them are positive and "+negativeCount+" of them are negative");
    }
}
