package Arrays;

import java.util.Scanner;

public class Array101 {
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
        int[] b;
        b = new int[n+1];
        for (int i = 0; i <=k ; i++) {
            b[i]=a[i];
        }
        b[k+1]=0;
        for (int i = k+1; i <a.length ; i++) {
            b[i+1]=a[i];
        }
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i] + " ");

        }
    }
}
