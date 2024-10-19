package Boolean;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter four-digit integer number: ");
        int num= input.nextInt();
        int ones=num%10;
        int tens=( num/10)%10;
        int hundreds= (num/100)%10;
        int thousands=num/1000;
        boolean a= ones==thousands && tens==hundreds;
        System.out.println( "The number is read equally both from left to right and from right to left. Is it correct? "+a );

    }
}
