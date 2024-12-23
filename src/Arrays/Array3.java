package Arrays;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= input.nextInt();
        System.out.print("Enter A :");
        int A= input.nextInt();
        System.out.print("Enter D :");
        int D= input.nextInt();
        int [] arifmetikProgressiya;
        arifmetikProgressiya=new int[n];
        for (int i = 0; i < arifmetikProgressiya.length; i++) {
            arifmetikProgressiya[i]=A;
            A+=D;
        }
        printArray(arifmetikProgressiya);
    }
    static void printArray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
