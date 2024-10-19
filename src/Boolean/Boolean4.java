package Boolean;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B: ");
        int A= input.nextInt();
        int B= input.nextInt();
        boolean equal=A>2 && B<=3;
        System.out.println("Are A > 2 and B ≤ 3 both  fulfilled?"+equal);
    }
}
