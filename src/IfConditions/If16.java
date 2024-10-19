package IfConditions;

import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        if (A<B && B<C){
            A=A*2;
            B=B*2;
            C=C*2;
            System.out.println("A="+A+",B="+B+",C="+C);
        }else{
            A=-A;
            B=-B;
            C=-C;
            System.out.println("A="+A+",B="+B+",C="+C);
        }
    }
}
