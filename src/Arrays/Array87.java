package Arrays;

import java.util.Scanner;

public class Array87 {
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
        int count=0;
        for (int i = 1; i < a.length; i++) {
            if(a[0]>a[i]) count++;
        }
        int temp=a[0];
        for (int i = 0; i <count; i++) {
            a[i]=a[i+1];
        }
        a[count]=temp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
