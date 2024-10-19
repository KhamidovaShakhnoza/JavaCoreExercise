package IfConditions;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        if (A==B){
            System.out.println("Third one is different");
        }else if (B==C){
            System.out.println("First one is different");
        }else if (A==C){
            System.out.println("Second one is different");
        }
    }
}
