package MethodsFunctions;

import java.util.Scanner;

public class FunSimple30 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter K1 :");
        int K1= input.nextInt();
        System.out.println("Enter N1 digit number :");
        int N1= input.nextInt();
        System.out.println("N1 digit of K1 is :"+DigitN(K1,N1));

        System.out.println("Enter K2 :");
        int K2= input.nextInt();
        System.out.println("Enter N2 digit number :");
        int N2= input.nextInt();
        System.out.println("N2 digit of K2 is :"+DigitN(K2,N2));



    }
    public static int DigitN(int K,int N){
        int count = 1;

        while (K > 0) {
            int digit = K % 10;
            if (count == N) {
                return digit;
            }
            K /= 10;
            count++;
        }

        return -1;
    }
}
