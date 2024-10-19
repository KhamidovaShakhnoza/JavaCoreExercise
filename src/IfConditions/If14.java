package IfConditions;

import java.util.Scanner;

public class If14 {
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
                System.out.println("Minimal:"+C+" Maximal:"+A);
            }else{
                System.out.println("Minimal:"+B+" Maximal:"+A);
            }
        }else if (B > A && B > C) {
            if (A>C){
                System.out.println("Minimal:"+C+" Maximal:"+B);
            }else{
                System.out.println("Minimal:"+A+" Maximal:"+B);
            }
        }else{
            if (A>B){
                System.out.println("Minimal:"+B+" Maximal:"+C);
            }else{
                System.out.println("Minimal:"+A+" Maximal:"+C);
            }
        }
    }
}
