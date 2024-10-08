package Integer;

import java.util.Scanner;

public class Integer7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two-digit number: ");
        int num= input.nextInt();
        int tensdigit=num/10;
        int onesdigit=num%10;
        int sum=tensdigit+onesdigit;
        int product=tensdigit-onesdigit;
        System.out.println("Sum of digits is="+sum+"; Product is="+product);
    }
}
