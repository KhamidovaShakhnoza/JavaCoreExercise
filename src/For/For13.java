package For;

import java.util.Scanner;

public class For13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        double sum=n/2*(1.1-1.2);
        System.out.println("Sum="+sum);
    }
}
