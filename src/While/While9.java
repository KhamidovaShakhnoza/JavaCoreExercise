package While;

import java.util.Scanner;

public class While9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        int n = input.nextInt();
        int k =1;
        double square=3;
        while (square<n){
            square=Math.pow(3,k);
            k++;
        }
        System.out.println(k-1);
    }
}