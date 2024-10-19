package IfConditions;

import java.util.Scanner;

public class If8 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        System.out.println("Enter b : ");
        int b= input.nextInt();
        if (a>b){
            System.out.println(a+", "+b);
        }else{
            System.out.println(b+", "+a);
        }
    }
}
