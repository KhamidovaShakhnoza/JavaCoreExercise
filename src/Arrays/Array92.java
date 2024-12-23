package Arrays;

import java.util.Scanner;

public class Array92 {
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
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0)count++;
        }
        int[] b;
        b = new int[count];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0) {
                b[j]=a[i];
                j++;
            }
        }
        a=b;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
    }
}
