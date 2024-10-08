package Integer;

import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter four-digit number: ");
        int num= input.nextInt();
        int n=num/100;
        int m=n%10;
        System.out.println("Tens digit is "+m);
    }
}
