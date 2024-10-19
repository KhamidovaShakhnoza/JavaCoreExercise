package IfConditions;

import java.util.Scanner;

public class If3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        if (a>0) {
            System.out.println(a - 8);
        }else if(a==0){
            a=10;
            System.out.println(a);

        }else {
            System.out.println(a+6);
        }
    }
}
