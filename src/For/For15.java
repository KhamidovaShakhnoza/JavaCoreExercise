package For;

import java.util.Scanner;

public class For15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0),a:");
        int n = input.nextInt();
        double a= input.nextDouble();
        double sum=1;
        for (double i=1;i<=n;i++){
            sum*=a;
        }
        System.out.println("a^n="+sum);
    }
}
