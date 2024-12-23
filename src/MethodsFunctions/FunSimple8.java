package MethodsFunctions;

import java.util.Scanner;

public class FunSimple8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b (1<=b<=9): ");
        int a= input.nextInt();
        int b= input.nextInt();
        System.out.println(AddRightDigit(a,b));

    }
    public static int AddRightDigit(int number, int r){
        int reversed = 0;
        reversed=number*10+r;
        return reversed;
    }
}
