package Integer;

import java.util.Scanner;

public class Integer9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter three-digit number: ");
        int num= input.nextInt();
        int firstdigit=num/100;
        System.out.println(firstdigit);
    }
}
