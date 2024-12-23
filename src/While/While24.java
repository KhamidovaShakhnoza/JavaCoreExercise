package While;

import java.util.Scanner;

public class While24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        int n = input.nextInt();
        int F0=0;
        int F1=1;
        int s=0;
        while(s<n){
            s=F1+F0;
            F0=F1;
            F1=s;
        }
        if (s==n){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
