package MethodsFunctions;

import java.util.Scanner;

public class FunSimple7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers a,b,c: ");
        int a= input.nextInt();
        System.out.println(InvertDigit(a));
        int b= input.nextInt();
        System.out.println(InvertDigit(b));
        int c= input.nextInt();
        System.out.println(InvertDigit(c));
    }
    public static int InvertDigit(int number){
        int reversed = 0;
        while (number > 0) {
            int digit = number % 10; // Extract last digit
            reversed = reversed * 10 + digit; // Build reversed number
            number /= 10; // Remove last digit
        }
        return reversed;
        }
    }
