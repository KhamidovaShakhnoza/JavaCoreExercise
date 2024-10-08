package Integer;

import java.util.Scanner;

public class Integer16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three-digit number: ");
        int num= input.nextInt();
        int n=num/10;
        int onesdigit=num%10;
        int tensdigit=n%10;
        int hundredsdigit=n/10;
        int h=onesdigit;
        onesdigit=tensdigit;
        tensdigit=h;
        System.out.println("Result is "+hundredsdigit+tensdigit+onesdigit);

    }
}
