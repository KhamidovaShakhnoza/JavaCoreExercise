package Boolean;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter x and y Coordinates of chessboard (0<x,y<=8):");
        int x = input.nextInt();
        int y= input.nextInt();
        boolean a=(x+y)%2==1;
        System.out.println("The chessboard square (x, y) is white. Is it correct? "+a);
    }
}
