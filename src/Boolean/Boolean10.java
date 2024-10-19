package Boolean;

import java.util.Scanner;

public class Boolean10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B : ");
        int A= input.nextInt();
        int B= input.nextInt();
        boolean odd = A%2==1 ^ B%2==1;
        System.out.println("Is exactly one of A and B odd? "+odd);
    }
}
