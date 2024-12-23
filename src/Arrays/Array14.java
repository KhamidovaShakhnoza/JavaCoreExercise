package Arrays;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        System.out.println("Enter elements of array :");
        int[] array;
        array=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }

        for (int i = 0; i <array.length ; i+=2) {
            System.out.print(array[i]+" ");
        }
        for (int i = 1; i <array.length ; i+=2) {
            System.out.print(array[i]+" ");
        }
    }
}
