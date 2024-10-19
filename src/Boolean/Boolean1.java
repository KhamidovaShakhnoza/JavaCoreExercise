package Boolean;

import java.util.Scanner;

public class Boolean1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A: ");
        int A= input.nextInt();
        boolean B=A>0;
        System.out.println("Is A positive? "+B);
    }
}
