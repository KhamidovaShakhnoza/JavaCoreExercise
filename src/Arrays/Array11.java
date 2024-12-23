package Arrays;

import java.util.Scanner;

public class Array11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        System.out.print("Enter K: ");
        int K= input.nextInt();
        System.out.println("Enter elements of array :");
        int[] array;
        array=new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i]=input.nextInt();
        }

        for (int i = 0; i <array.length ; i++) {
            if (i%K==0){
                System.out.print(array[i]+" ");
            }
    }
}



}
