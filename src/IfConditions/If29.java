package IfConditions;

import java.util.Scanner;

public class If29 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        int x= input.nextInt();
        if (x>0){
            if(x%2==0){
                System.out.println(x+" is positive even number!");
            }else{
                System.out.println(x+" is positive odd number!");
            }
        }else if (x<0){
            if(-x%2==0){
                System.out.println(x+" is negative even number!");
            }else{
                System.out.println(x+" is negative odd number!");
            }

        }else{
            System.out.println(x+" is zero!");
        }
    }
}
