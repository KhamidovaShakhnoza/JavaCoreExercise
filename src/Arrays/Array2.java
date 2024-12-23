package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n: ");
        int n= input.nextInt();
        int [] twoPower;
        twoPower=new int[n];
        for (int i = 0; i < twoPower.length;i++) {
            twoPower[i]=Power(2,i);
        }
        printArray(twoPower);
    }
    static void printArray(int[] a){
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static int Power(int a,int b){
        int r=1;
        for (int i = 0; i <b ; i++) {
            r*=a;
        }
        return r;
    }
}
