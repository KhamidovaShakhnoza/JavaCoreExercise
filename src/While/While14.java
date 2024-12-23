package While;

import java.util.Scanner;

public class While14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter N (N>1):");
        double n= input.nextDouble();
        int i=0;
        double sum=0;
        while(sum<n) {
            i++;
            sum += 1.0/i;
        }
        i--;
        sum -= 1.0 / (i + 1);

        System.out.println("Sum = "+(sum)+" ; Last num = "+(i));
    }
}
