package Arrays;

import java.util.Scanner;

public class Array47 {
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

        int[] uniqueArray = getUniqueNumbers(array);

        // Print the unique elements
        System.out.println("Unique elements in the array:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }

    }
public static int[] getUniqueNumbers(int[] array) {
    int n = array.length;
    int[] temp = new int[n];
    int uniqueCount = 0;
    for (int i = 0; i < n; i++) {
        boolean isUnique = true;

        // Check if the current element is a duplicate
        for (int j = 0; j < uniqueCount; j++) {
            if (array[i] == temp[j]) {
                isUnique = false;
                break;
            }
        }

        // If it's unique, add it to the temp array
        if (isUnique) {
            temp[uniqueCount] = array[i];
            uniqueCount++;
        }
    }

    // Create a result array with only the unique elements
    int[] uniqueArray = new int[uniqueCount];
    System.arraycopy(temp, 0, uniqueArray, 0, uniqueCount);

    return uniqueArray;
}
}
