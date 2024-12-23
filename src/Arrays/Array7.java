package Arrays;

import java.util.Scanner;

public class Array7 {
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
        printArray(array);
    }
    static void printArray(int[] a){
        for (int i = a.length-1; i >-1 ; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
