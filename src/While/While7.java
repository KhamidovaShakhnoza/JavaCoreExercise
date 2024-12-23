package While;

import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        int k=1;
        int square=1;
        while(square<n) {
            square = k * k;
            k++;
        }
        System.out.println(k-1);
        }

}
