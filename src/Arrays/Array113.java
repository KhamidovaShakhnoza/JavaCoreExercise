package Arrays;

import java.util.Scanner;

public class Array113 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        int temp=0;
        for (int i = 0; i <a.length-1 ; i++) {
            int min=a[i];
            for (int j = i+1; j < a.length; j++) {
                if (a[j]<min) {
                    min = a[j];
                    temp = j;
                }
            }
            a[temp]=a[i];
            a[i]=min;
        }
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
