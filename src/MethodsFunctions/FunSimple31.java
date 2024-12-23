package MethodsFunctions;

import java.util.Scanner;

public class FunSimple31 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:  ");
        int number= input.nextInt();
        System.out.println("Is given number palindrom? "+IsPalindrome(number));
        System.out.println(Count(number));
    }
    public static int Count(int m){
        int count=0;
        while(m>0){
            m=m/10;
            count++;
        }
        return count;
    }
    public static boolean IsPalindrome(int n){
        boolean r= true;
        int l=1;
        for (int i = 1; i < Count(n); i++) {
            l*=10;
        }

        int j=10;
        while (n>0){
            int firstNum=n/l;
            int lastNum=n%j;
            if ( firstNum!=lastNum) r= false;
            n%=l;
            n/=j;
            l/=100;


        }
        return r;
    }
}
