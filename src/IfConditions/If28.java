package IfConditions;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year= input.nextInt();
        if (year%100==0 ){
            if (year%400==0){
                System.out.println(year+" have 366 days");
            }else{
                System.out.println(year+" have 365 days");
            }
        }else if (year%4==0){
            System.out.println(year+" have 366 days");
        }else{
            System.out.println(year+" have 365 days");
        }
    }
}
