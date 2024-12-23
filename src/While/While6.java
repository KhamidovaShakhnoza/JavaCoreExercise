package While;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        int fact=1;
        while(n>=1){
            fact*=n;
            n-=2;
        }
        System.out.println("N!!="+fact);
    }
}
