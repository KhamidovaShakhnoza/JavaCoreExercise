package Integer;

import java.util.Scanner;

public class Integer5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive two numbers(first one is greater than second number): ");
        int A= input.nextInt();
        int B= input.nextInt();
        int remainder=A%B;
        System.out.println("The unused part is "+remainder);
    }
}
