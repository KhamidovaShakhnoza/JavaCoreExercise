package While;

import java.util.Scanner;

public class While22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        int n = input.nextInt();
        int k=2;
        int m=0;
        int division;
        while (k<n){
            division=n%k;
            if (division==0){
                m=1;
            }
            k++;
        }if (m==1){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
