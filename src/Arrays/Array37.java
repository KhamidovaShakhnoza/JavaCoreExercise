package Arrays;

import java.util.Scanner;

public class Array37 {
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
        System.out.println( "Count is :"+printArray(array));
    }

    static int printArray(int[] a) {
        int count = 0;
        boolean isAscending = false;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[i - 1]) {
                if (!isAscending) {
                    count++;
                    isAscending = true;
                }
            } else {
                isAscending = false;
            }
        }

        return count;
    }
}
