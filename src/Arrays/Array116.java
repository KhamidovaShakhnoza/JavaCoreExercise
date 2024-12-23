package Arrays;

import java.util.Scanner;

public class Array116 {
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
        int count=1;
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]!=a[i+1])count++;
        }
        int[] b=new int[count];
        int[] c=new int[count];
        int k=0;
        c[count-1]=a[a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            if (a[i]!=a[i+1]){
                c[k]=a[i];
                k++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            int count1=0;
            for (int j = i+1; j < a.length; j++) {
                if (c[i]==a[j])count1++;
            }
            b[i]=count1;
        }
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        for (int i = 0; i <c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}
