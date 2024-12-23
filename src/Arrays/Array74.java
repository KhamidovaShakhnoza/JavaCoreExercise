package Arrays;

import java.util.Scanner;

public class Array74 {
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
        int min = a[0];
        int max = a[0];
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min){
                min = a[i];
                count1 = i;
            }
            if (a[i] > max) {
                max = a[i];
                count2 = i;
            }
        }
        if (count1 < count2) {
            for (int i = count1 + 1; i < count2; i++) {
                a[i] = 0;
            }
        } else {
            for (int i = count2 + 1; i < count1; i++) {
                a[i] = 0;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
