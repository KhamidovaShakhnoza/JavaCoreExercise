package MethodsFunctions;

import java.util.Scanner;

public class FunSimple50 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter numbers t1, t2, t3:  ");
        int t1= input.nextInt();
        System.out.println(t1+ " = "+TimeToHMS(t1));
        int t2= input.nextInt();
        System.out.println(t2+ " = "+TimeToHMS(t2));
        int t3= input.nextInt();
        System.out.println(t3+ " = "+TimeToHMS(t3));

    }
    public static String TimeToHMS(int T){
        int H;int M;int S;
        H=T/3600;
        M=(T%3600)/60;
        S=((T%3600)%60);
        return H+":"+M+":"+S;
    }
}
