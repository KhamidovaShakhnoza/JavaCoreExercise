package MethodsFunctions;

import java.util.Scanner;

public class FunSimple25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a = input.nextInt();
        System.out.println("Is "+a+" square of number? "+IsSquare(a));
        int b = input.nextInt();
        System.out.println("Is "+b+" square of number? "+IsSquare(b));
        int c = input.nextInt();
        System.out.println("Is "+c+" square of number? "+IsSquare(c));
    }
    public static boolean IsSquare(int k){
        boolean r=true;
        int m=1;
        for (int i = 1; m < k; i++) {
            m=i*i;
        }
        if (m==k) r= true;
        if (m!=k) r= false;
        return r;
    }

}
