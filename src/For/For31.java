package For;

import java.util.Scanner;

public class For31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        double previous=2;
        System.out.printf("A0 = %.2f%n", previous);
        for (int i=1;i<=n;i++){
            double current=2+1/previous;
            System.out.printf("A%d = %.2f%n", i, current);
            previous=current;
        }
input.close();
    }
}
