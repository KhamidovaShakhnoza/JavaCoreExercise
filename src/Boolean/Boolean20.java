package Boolean;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter three-digit integer number: ");
        int num= input.nextInt();
        int ones=num%10;
        int tens=( num/10)%10;
        int hundreds= num/100;
        boolean a= ones!=tens && tens!=hundreds && ones!=hundreds;
        System.out.println("Are all digits different?"+a);
    }
}
