package Matrix;

import java.util.Scanner;

public class Matrix10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter m: ");
        int m= input.nextInt();
        System.out.println("Enter n: ");
        int n= input.nextInt();

        int[][] a=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n ; j++) {
                a[i][j]=(int)(Math.random()*100);
            }
        }
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j+=2) {
                System.out.print(a[i][j]+"\t ");
            }
            System.out.println();
        }
    }
}
