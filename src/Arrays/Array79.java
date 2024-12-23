package Arrays;

import java.util.Scanner;

public class Array79 {
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
        int temp=a[0];
        a[0]=0;
        int s;
        for (int i = 1; i < a.length-1; i+=2) {
           s=a[i];
           a[i]=temp;
           temp=a[i+1];
           a[i+1]=s;

        }
        a[0]=0;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
