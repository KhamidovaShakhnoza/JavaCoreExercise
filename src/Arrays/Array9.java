package Arrays;

import java.util.Scanner;

public class Array9 {
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
        int count =0;
        for (int i = a.length-1; i >-1 ; i--) {
            if (a[i]%2==0){
                System.out.print(a[i]+" ");
                count++;
        }}
        System.out.println("Soni :"+count);
    }
}


