package Arrays;

import java.util.Scanner;

public class Array24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter elements of array :");
        int[] array;
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        printArray(array);
    }

    static void printArray(int[] a) {
        int r = 1;
        int d = a[1] - a[0];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i + 1] != a[i] + d) {
                r = 0;
                break;
            }
            if (i == a.length - 1) r = 1;
        }
        if (r == 0) System.out.println(0);
        else System.out.println(d);
    }

}