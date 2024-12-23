package For;

import java.util.Scanner;

public class For37 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n= input.nextInt();
        int sum=0;
        for (double i=1;i<=n;i++){
            double k=i;
            double pow=Math.pow(i,k);
            sum+=pow;
        }
        System.out.println("Sum="+sum);
    }
}
