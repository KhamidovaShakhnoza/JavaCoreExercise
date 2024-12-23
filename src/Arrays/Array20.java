package Arrays;

import java.util.List;
import java.util.Scanner;

public class Array20 {
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
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter K: ");
        int K = sc.nextInt();
        System.out.print("Enter L: ");
        int L = sc.nextInt();
        int sum=0;
        for (int i = K;i<=L;i++) {
            sum+=a[i];

        }
        System.out.println("Sum :"+sum);
    }
}