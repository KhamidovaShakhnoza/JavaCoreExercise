package Arrays;

import java.util.Scanner;

public class Array112 {
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
        for (int i = 0; i <a.length ; i++) {
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
            }}
        }
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
