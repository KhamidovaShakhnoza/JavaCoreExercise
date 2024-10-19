package IfConditions;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        System.out.println("Enter D : ");
        int D= input.nextInt();
        if (B==C && C==D && A!=B){
            System.out.println("First one is different");
        }else if (A==C && C==D && A!=B){
            System.out.println("Second one is different");
        }else if (B==A && B==D && C!=B){
            System.out.println("Third one is different");
        }else if (B==C && A==B && A!=D){
            System.out.println("Fourth one is different");
        }else{
            System.out.println("There are not three equal numbers");
        }
    }
}
