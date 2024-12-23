package While;

import java.util.Scanner;

public class While18 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>0):");
        int n= input.nextInt();
        int count=0;
        int sum=0;
        while(n>0){
            sum+=n%10;
            n=n/10;
            count++;
        }
        System.out.println("Amount of digits is "+count+"; Sum of them is "+sum);
    }
}
