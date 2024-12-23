package Arrays;

import java.util.Scanner;

public class Array89 {
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
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]) count=i+1;
        }
        int temp=a[count];
        for (int i = 0; i <count; i++) {
            if(a[i]>temp){
                for(int j=count;j>i;j--){
                    a[j]=a[j-1];
                }
                a[i]=temp;
                break;
            }
        }


        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
