package Integer;

import java.util.Scanner;

public class Integer10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three-digit number: ");
        int num= input.nextInt();
        int n=num/10;
        int onesdigit=num%10;
        int tensdigit=n%10;
        System.out.println("Tensdigit is "+tensdigit+" Onesdigit is "+onesdigit);
    }
}
