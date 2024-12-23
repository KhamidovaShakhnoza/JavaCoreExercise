package Arrays;

import java.util.Scanner;

public class Array52 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int[] b;
        b = new int[n];
        for (int j = 0; j < a.length; j++) {
            if (a[j]<5) b[j]=2*a[j];
            else b[j]=a[j]/2;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}
