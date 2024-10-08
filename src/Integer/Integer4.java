package Integer;

import java.util.Scanner;

public class Integer4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive two numbers(first one is greater than second number): ");
        int A= input.nextInt();
        int B= input.nextInt();
        int segmentsB=A/B;
        System.out.println("The number of segments of B in A is "+segmentsB);


    }
}
