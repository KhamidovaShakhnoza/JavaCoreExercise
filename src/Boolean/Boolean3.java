package Boolean;

import java.util.Scanner;

public class Boolean3 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A: ");
        int A= input.nextInt();
        boolean even =A%2==0;
        System.out.println("Is A even? "+even);
    }
}
