package Boolean;

import java.util.Scanner;

public class Boolean19 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three positive integer numbers: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int num3= input.nextInt();
        boolean n = num1==-num2 || num3==-num1 || num2==-num3;
        System.out.println("Is there at least one of them opposite to other one? "+n);
    }
}
