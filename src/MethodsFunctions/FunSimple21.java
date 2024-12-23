package MethodsFunctions;

import java.util.Scanner;

public class FunSimple21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.println(SumRange(a,b));
        System.out.println(SumRange(b,c));
    }
    public static int SumRange(int a, int b){
        int sum=0;
        if (a>b)  sum=0;
        if (a<b) {
            for (int i = a + 1; i < b; i++) {
                sum += i;
            }
        }
            return sum;
    }
}
