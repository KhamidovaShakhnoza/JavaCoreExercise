package For;

import java.util.Scanner;

public class For35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>2):");
        int n = input.nextInt();
        double previous1=1;
        System.out.printf("A1 = %.2f%n", previous1);
        double previous2=2;
        System.out.printf("A2 = %.2f%n", previous2);
        double previous3=3;
        System.out.printf("A3 = %.2f%n", previous3);
        for (int i=4;i<=n;i++){
            double current=previous3+previous2-previous1;
            System.out.printf("A%d = %.2f%n", i, current);
            previous1=previous2;
            previous2=previous3;
            previous3=current;
        }
        input.close();
    }
}
