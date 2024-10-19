package IfConditions;

import java.util.Scanner;

public class If22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x (x!=0) : ");
        int x= input.nextInt();
        System.out.println("Enter y (y!=0): ");
        int y= input.nextInt();
        if (x>0 && y>0){
            System.out.println("The point located in I-quarter");
        }else if (x<0 && y>0){
            System.out.println("The point located in II-quarter");
        }else if (x<0 && y<0){
            System.out.println("The point located in III-quarter");
        }else{
            System.out.println("The point located in IV-quarter");
        }
    }
}
