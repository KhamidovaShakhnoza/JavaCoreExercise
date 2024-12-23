package Arrays;

import java.util.Scanner;

public class Array90 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[n];
        int[] b;
        b = new int[n-1];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i <k; i++) {
            b[i]=a[i];
        }
        for (int i = k; i <a.length-1; i++) {
            b[i]=a[i+1];
        }
        a=b;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
