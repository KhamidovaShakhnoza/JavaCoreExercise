package Matrix;

import java.util.Scanner;

public class Matrix17 {
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
        System.out.println("Enter k: ");
        int k= input.nextInt();
        int prod=1; int sum=0;
        for (int i = 0; i < n; i++) {
            sum+=a[k][i];
            prod*=a[k][i];
        }
        System.out.println("Sum="+sum+" Prod="+prod);
    }
}
