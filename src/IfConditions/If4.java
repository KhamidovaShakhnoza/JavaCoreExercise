package IfConditions;

import java.util.Scanner;

public class If4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        System.out.println("Enter b : ");
        int b= input.nextInt();
        System.out.println("Enter c : ");
        int c= input.nextInt();
        int positiveCount=0;
        if (a>0)  {
            positiveCount++;
        }
        if (b>0)  {
            positiveCount++;
        }
        if (c>0)  {
            positiveCount++;
        }
        System.out.println(positiveCount +" of them are positive");
    }
}
