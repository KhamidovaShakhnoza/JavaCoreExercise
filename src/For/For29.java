package For;

import java.util.Scanner;

public class For29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>1),A,B:");
        int n = input.nextInt();
        double A= input.nextDouble();
        double B= input.nextDouble();
        double h=(B-A)/n;
        System.out.println("Length of each sub-segment (H) = "+h);
        for (int i=0;i<=n;i++){
            double sum=A+i*h;
            System.out.printf("Point %d: %.6f%n", i, sum);

        }
        input.close();
    }
}
