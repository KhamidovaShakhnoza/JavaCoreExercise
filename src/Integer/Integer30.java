package Integer;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year= input.nextInt();
        int century=year/100;
        int c=century+1;
        System.out.println("Century is "+c);
    }
}
