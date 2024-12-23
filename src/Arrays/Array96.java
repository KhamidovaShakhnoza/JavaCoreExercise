package Arrays;

import java.util.Scanner;

public class Array96 {
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
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j])count++;
                break;
            }
        }
        int[] b;
        b = new int[n-count];
        int temp=0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length; j++) {
                if(a[i]==a[j]){
                    for (int k = j; k <a.length-1 ; k++) {
                        a[k]=a[k+1];
                    }
                }
            }
        }
        for (int i = 0; i <b.length; i++) {
            b[i]=a[i];
            System.out.print(b[i] + " ");

        }

    }
}
