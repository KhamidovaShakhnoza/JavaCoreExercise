package Arrays;

import java.util.Scanner;

public class Array43 {
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
        int count=1;
        for (int i = 1; i < array.length; i++) {
            if (array[i-1]==array[i]){
                count--;
            }
            count++;
        }
        System.out.println(count);
    }
}
