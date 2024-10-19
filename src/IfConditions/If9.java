package IfConditions;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        if (A<B){
            System.out.println("A="+A+", B="+B);
        }else if(A>B){
            int m=A;
            A=B;
            B=m;
            System.out.println("A="+A+", B="+B);
        }
    }
}
