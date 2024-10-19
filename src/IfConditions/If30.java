package IfConditions;

import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x (1<x<999): ");
        int x= input.nextInt();
        if (x/100==0 && x/10==0){
            if(x%2==0){
                System.out.println(x+" is one-digit even number!");
            }else{
                System.out.println(x+" is one-digit odd number!");
            }
        }else if (x/100==0){
            if(x%2==0){
                System.out.println(x+" is two-digit even number!");
            }else{
                System.out.println(x+" is two-digit odd number!");
            }

        }else{
            if(x%2==0){
                System.out.println(x+" is three-digit even number!");
            }else{
                System.out.println(x+" is three-digit odd number!");
            }
        }
    }
}
