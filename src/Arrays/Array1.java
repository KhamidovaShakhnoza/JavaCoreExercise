package Arrays;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= input.nextInt();
        int[] oddNumbers=new int[n];
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i]=2*i+1;
        }
        printArray(oddNumbers);
    }
   static void printArray(int[] a){
       for (int i = 0; i <a.length ; i++) {
           System.out.print(a[i]+" ");
       }
   }
}
