package Arrays;

import java.util.Scanner;

public class Array72 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter k: ");
        int k = input.nextInt();
        System.out.print("Enter h: ");
        int h = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int temp;
        int j=h-1;
        for (int i = k-1; i < h && i<j; i++) {
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            j--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
