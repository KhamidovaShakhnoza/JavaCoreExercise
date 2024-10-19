package Boolean;

import java.util.Scanner;

public class Boolean6 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B and C: ");
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();
        boolean a=A<B && B<C;
        System.out.println("Is the double inequality A < B < C fulfilled? "+a);
    }
}
