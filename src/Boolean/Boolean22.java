package Boolean;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three-digit integer number: ");
        int num= input.nextInt();
        int ones=num%10;
        int tens=( num/10)%10;
        int hundreds= num/100;
        boolean a= (hundreds<=tens && tens<=ones && hundreds<=ones) || (hundreds>=tens && tens>=ones && hundreds>=ones);
        System.out.println("All digits of the number are in ascending or descending order. Is it true ?"+a);

    }
}
