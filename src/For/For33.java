package For;

import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        double previous1=1;
        System.out.printf("F1 = %.2f%n", previous1);
        double previous2=1;
        System.out.printf("F2 = %.2f%n", previous2);
        for (int i=3;i<=n;i++){
            double current=previous1+previous2;
            System.out.printf("F%d = %.2f%n", i, current);
            previous1=previous2;
            previous2=current;
        }
        input.close();
    }
}
