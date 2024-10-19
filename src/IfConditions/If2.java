package IfConditions;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a : ");
        int a= input.nextInt();
        if (a>0) {
            System.out.println(a-8);

        }else {
            System.out.println(a+6);
        }
    }
}
