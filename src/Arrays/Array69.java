package Arrays;

import java.util.Scanner;

public class Array69 {
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
        int temp;
        for (int i = 0; i < a.length; i+=2) {
            temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
