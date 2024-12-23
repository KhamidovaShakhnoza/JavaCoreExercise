package Arrays;

import java.util.Scanner;

public class Array82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int j=k;
        for (int i = 0; i < a.length-k; i++) {
            a[i]=a[j];
            j++;

        }
        for (int i = a.length-k; i < a.length; i++) {
            a[i]=0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
