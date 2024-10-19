package IfConditions;

import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        if (A!=B){
            int sum=A+B;
            A=sum;
            B=sum;
            System.out.println("A="+A+", B="+B);
        }else{
            A=B=0;
            System.out.println("A="+A+", B="+B);
        }
    }
}
