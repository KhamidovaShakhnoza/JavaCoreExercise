package Boolean;

import java.util.Scanner;

public class Boolean16 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter positive integer number: ");
        int num= input.nextInt();
        boolean n = num%2==0 && num/100==0 && num/10!=0;
        System.out.println("Is given number two-digit and even? "+n);
    }
}
