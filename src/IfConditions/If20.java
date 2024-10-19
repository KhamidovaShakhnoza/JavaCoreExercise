package IfConditions;

import java.util.Scanner;

public class If20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter A : ");
        int A= input.nextInt();
        System.out.println("Enter B : ");
        int B= input.nextInt();
        System.out.println("Enter C : ");
        int C= input.nextInt();
        if (Math.absExact((A-B))>Math.absExact((A-C))){
            System.out.println("Nearest point is "+C+"; Distance is "+(Math.absExact((A-C))));
        }else{
            System.out.println("Nearest point is "+B+"; Distance is "+(Math.absExact((A-B))));

        }
    }
}
