package For;

import java.util.Scanner;

public class For17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0),a:");
        int n = input.nextInt();
        double a= input.nextDouble();
        double sum=0;
        double pow=1;
        for (double i=1;i<=n;i++){
            pow=Math.pow(a,i);
            sum+=pow;
        }
        System.out.println("Sum="+sum);
    }
}
