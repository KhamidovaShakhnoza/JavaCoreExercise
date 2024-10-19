package IfConditions;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x : ");
        int x= input.nextInt();
        System.out.println("Enter y : ");
        int y= input.nextInt();
        if (x==0 && y==0){
            System.out.println(0);

        }else if (y==0 ){
            System.out.println(1);
        }else if (x==0 ) {
            System.out.println(2);
        }else {
            System.out.println(3);
        }
    }
}
