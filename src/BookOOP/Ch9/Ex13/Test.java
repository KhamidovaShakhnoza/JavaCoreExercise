package BookOOP.Ch9.Ex13;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:" );
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        System.out.print("Enter the array: ");
        double[][]a=new double[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextDouble();
            }

        }

        Location location=Location.locateLargest(a);
        System.out.println("The location of the largest element is "+ location.maxValue+" at ("+ location.row+", "+location.column+")");

    }
}
