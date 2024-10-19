package Boolean;

import java.util.Scanner;

public class Boolean5 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter integer A and B: ");
        int A= input.nextInt();
        int B= input.nextInt();
        boolean equal=A>=0 || B<-2;
        System.out.println("Are A >= 0 or B <-2 both  fulfilled? "+equal);

    }
}
