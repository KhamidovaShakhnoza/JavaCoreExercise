package Arrays;

import java.util.Scanner;

public class Array108 {
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
            if (a[i]>0)count++;
        }
        int[] b;
        b = new int[n+count];
        int temp=0;
        int m=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]>0){
                for (int j =temp; j <i ; j++) {
                    b[m]=a[j];
                    m++;
                    temp=i;
                }
                b[m]=0;
                m++;
            }
        }
        b[m]=a[a.length-1];
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
