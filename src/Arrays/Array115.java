package Arrays;

import java.util.Scanner;

public class Array115 {
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
        int[] b={0,1,2,3,4};
        int temp;     //3 1 0 2 4  result of 5 3 7 1 8
        int k=0;  int l; int m;
        for (int i = 0; i <a.length ; i++) {
            l=k+1;
            for (int j = i+1; j <a.length ; j++) {
                if (a[i]>a[j]){
                    temp=a[i];m=b[k];
                    a[i]=a[j];b[k]=b[l];
                    a[j]=temp;b[l]=m;
                }
                l++;
            }
            k++;
        }
        for (int i = 0; i <b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
