package Arrays;

import java.util.Scanner;

public class Array51 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        System.out.println("Enter elements of array :");
        int[] a;
        a=new int[n];
        int[]b;
        b=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            b[i]=input.nextInt();
        }
        int [] temp=a;
        a=b;
        b=temp;
        printArray(a);
        printArray(b);
    }
    static void printArray(int[] a){
        for (int i =0; i <a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
