package Arrays;

import java.util.Scanner;

public class Array58 {
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
            int sum=0;
            for (int i = 0; i <= j; i++) {
                sum+=a[i];
            }
            b[j]=sum;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
