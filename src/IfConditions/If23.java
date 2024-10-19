package IfConditions;

import java.util.Scanner;

public class If23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter vertices A (x1;y1) : ");
        int x1= input.nextInt();
        int y1= input.nextInt();
        System.out.println("Enter vertices B (x2;y2): ");
        int x2=x1;
        int y2= input.nextInt();
        System.out.println("Enter vertices C (x3;y3): ");
        int x3= input.nextInt();
        int y3= y2;
        System.out.println("Coordinates of fourth vertex is "+x3+" and "+y1);
    }
}
