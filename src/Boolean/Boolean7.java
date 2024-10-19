package Boolean;

import java.util.Scanner;

public class Boolean7 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B and C: ");
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();
        boolean a=(A<B && B<C) || (C<B && B<A);
        System.out.println("Is the number B between A and C ? "+a);

    }
}
