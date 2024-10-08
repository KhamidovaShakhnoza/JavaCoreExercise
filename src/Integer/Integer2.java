package Integer;

import java.util.Scanner;

public class Integer2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the weight in kilograms: ");
        int M = input.nextInt();
        int T=M/1000;
        System.out.println("The weight in tons is "+T);



    }
}
