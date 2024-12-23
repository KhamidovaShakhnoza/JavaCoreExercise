package While;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        while(n>=3){
            n-=3;
        }if (n==0) System.out.println("True");
        else System.out.println("False");
    }
}
