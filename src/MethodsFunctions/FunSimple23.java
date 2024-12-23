package MethodsFunctions;

import java.util.Scanner;

public class FunSimple23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers x1,y1: ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        Quarter(x1,y1);

        System.out.println("Enter numbers x2,y2: ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        Quarter(x2,y2);

    }
    public static void Quarter(int x, int y){
        if (x>0 && y>0) System.out.println("I chorak");
        else if (x<0 && y>0) System.out.println("II chorak");
        else if (x<0 && y<0) System.out.println("III chorak");
        else System.out.println("IV chorak");
    }
}
