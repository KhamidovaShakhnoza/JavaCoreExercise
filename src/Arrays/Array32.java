package Arrays;

import java.util.Scanner;

public class Array32 {
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
        for (int i = 2; i < a.length; i++) {
            if (a[i-2]>a[i-1] && a[i-1] < a[i]) {
                System.out.print((i-1)+" ");
                break;
            }
        }
        System.out.println();
    }
}
