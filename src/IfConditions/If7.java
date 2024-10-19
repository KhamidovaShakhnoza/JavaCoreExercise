package IfConditions;

import java.util.Scanner;

public class If7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        System.out.println("Enter b : ");
        int b= input.nextInt();
        if (a<b){
            System.out.println("First number is smaller than second");
        }else {
            System.out.println("Second one is smaller than first");
        }
    }
}
