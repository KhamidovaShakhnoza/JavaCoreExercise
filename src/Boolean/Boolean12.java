package Boolean;

import java.util.Scanner;

public class Boolean12 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B and C: ");
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();
        boolean a= A>0 && B>0 && C>0;
        System.out.println("Are all of them positive? "+a);
    }
}
