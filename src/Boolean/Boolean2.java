package Boolean;

import java.util.Scanner;

public class Boolean2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A: ");
        int A= input.nextInt();
        boolean odd =A%2==1;
        System.out.println("Is A odd? "+odd);
    }
}
