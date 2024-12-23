package Arrays;

import java.util.Scanner;

public class Array131 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter elements x and y of points :");
        int[] a;
        a = new int[n];
        for (int i = 0; i < 2*n; i++) {
            a[i] = input.nextInt();
        }

        System.out.print("Enter Bx, By: ");
        int Bx = input.nextInt();
        int By = input.nextInt();
    }
}
