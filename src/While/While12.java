package While;

import java.util.Scanner;

public class While12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        int sum=0;
        int n= input.nextInt();
        int i=0;
        while(sum<=n) {
            i++;
            sum += i;
        }

        System.out.println("Sum = "+(sum-i)+" ; Last num = "+(i-1));
    }
}
