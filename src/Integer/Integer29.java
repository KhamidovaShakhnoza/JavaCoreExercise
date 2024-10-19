package Integer;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive integers A, B, C: ");
        int A= input.nextInt();
        int B= input.nextInt();
        int C= input.nextInt();
        int n=(A/C)*(B/C);
        int s=A*B-((A/C)*C)*((B/C)*C);
        System.out.println("Number of squares is "+n+", Area of other space is "+s);


    }
}
