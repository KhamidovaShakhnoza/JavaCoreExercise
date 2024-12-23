package Arrays;

import java.util.Scanner;

public class Array63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter elements of a :");
        int[] a;
        a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Enter elements of b :");
        int[] b;
        b = new int[5];
        for (int i = 0; i < b.length; i++) {
            b[i] = input.nextInt();
        }
        int[] c;
        c = new int[10];
        for (int j = 0; j < a.length ; j++) {
                if(a[j]<b[j])c[j]=a[j];
                else c[j]=b[j];
        }
        int m=5;
        for (int j = 0; j < a.length ; j++) {
            if(a[j]>b[j])c[m]=a[j];
            else c[m]=b[j];
            m++;
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]+" ");
        }
    }
}
