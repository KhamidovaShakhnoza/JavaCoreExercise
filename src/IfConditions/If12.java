package IfConditions;

import java.util.Scanner;

public class If12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        if (A<B && A<C){
            System.out.println(A+" is minimum value");
        }else if (B<A && B<C) {
            System.out.println(B + " is minimum value");
        }else{
            System.out.println(C + " is minimum value");
        }

    }
}
