package Arrays;

import java.util.Scanner;

public class Array54 {
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
        for (int j = 0; j < a.length; j++) {
            if (a[j]%2==0) count++;
        }
        int[] b;
        b = new int[count];
        int m=0;
        for (int j = 0; j < a.length; j++) {
            if (a[j]%2==0){
                b[m]=a[j] ;
                m++;
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" ");
        }
        System.out.println("Count = "+count);

    }
}
