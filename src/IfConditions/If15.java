package IfConditions;

import java.util.Scanner;

public class If15 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        if (A > B && A > C) {
            if (B>C){
                System.out.println(A+B);
            }else{
                System.out.println(A+C);
            }
        }else if (B > A && B > C) {
            if (A>C){
                System.out.println(A+B);
            }else{
                System.out.println(B+C);
            }
        }else{
            if (A>B){
                System.out.println(A+C);
            }else{
                System.out.println(B+C);
            }
        }
    }
}
