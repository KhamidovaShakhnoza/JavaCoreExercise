package Integer;

import java.util.Scanner;

public class Integer8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two-digit number: ");
        int num= input.nextInt();
        int tensdigit=num/10;
        int onesdigit=num%10;
        int exchange=onesdigit;
        onesdigit=tensdigit;
        tensdigit=exchange;
        System.out.println("Exchange is "+tensdigit+onesdigit);

    }
}
