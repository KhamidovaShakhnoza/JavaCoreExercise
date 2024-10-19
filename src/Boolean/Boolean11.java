package Boolean;

import java.util.Scanner;

public class Boolean11 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B : ");
        int A= input.nextInt();
        int B= input.nextInt();
        boolean p = A%2==B%2;
        System.out.println("Do both  A and B have equal parity ? "+p);

    }
}
