package Arrays;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        System.out.print("Enter A :");
        int A= input.nextInt();
        System.out.print("Enter B :");
        int B= input.nextInt();
        int[] a;
        a=new int[n];
        a[0]=A;a[1]=B;
        int d=A+B;
        for (int i = 2; i < a.length; ) {
            a[i]=d;
            i++;
            d+=a[i-1];
        }
        printArray(a);

    }
    static void printArray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
