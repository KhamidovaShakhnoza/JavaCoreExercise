package Boolean;

import java.util.Scanner;

public class Boolean37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x1,y1,x2 and y2 Coordinates of chessboard (0<x1,y1,x2,y2<=8):");
        int x1 = input.nextInt();
        int y1= input.nextInt();
        int x2 = input.nextInt();
        int y2= input.nextInt();
        boolean a= Math.abs(x2 - x1) <= 1 && Math.abs(y2 - y1) <= 1;
        System.out.println("A king can move from one square to another during one turn. Is it correct? "+a);

    }
}
