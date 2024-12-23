package Arrays;

import java.util.Scanner;

public class Array65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int l=a[k-1];
        for (int i = 0; i < a.length; i++) {
            int r=a[i]+l;
            System.out.print(r+" ");
        }
    }
}
