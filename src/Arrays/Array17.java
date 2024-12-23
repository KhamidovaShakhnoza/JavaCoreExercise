package Arrays;

import java.util.Scanner;

public class Array17 {
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
        int i = 0;
        int j=array.length-1;
        for (; i <=j; ) {
            System.out.print(array[i]+" ");
            i++;
            System.out.print(array[i]+" "+array[j]+" ");
            i++;
            j--;
            System.out.print(array[j]+" ");
            j--;
        }
    }
}
