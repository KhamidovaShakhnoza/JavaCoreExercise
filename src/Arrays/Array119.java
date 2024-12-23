package Arrays;

import java.util.Scanner;

public class Array119 {
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
        int count=1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]!=a[i+1])count++;
        }
        int[] b=new int[n+count];
        int index = 0;  // 5 5 8 7 7 5   5 5 5 8 8 7 7 7 5 5
        for (int i = 0; i < a.length; i++) {
            b[index++] = a[i];
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                b[index++] =  b[i];
            }
        }
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

    }
}
