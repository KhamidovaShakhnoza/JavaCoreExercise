package For;

import java.util.Scanner;

public class For27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0),x (|x|<1):");
        int n = input.nextInt();
        double x= input.nextDouble();
        double sum=x;
        for(int i=1;i<=n;i++){
            double product=1;
            double value=1;
            for(int k=1;k<=2*i-1;k+=2) {
                product *= k;
            }
            for(int l=2;l<=2*i;l+=2){
                value*=l;
            }
            value*=(2*i+1);
            sum+=product*Math.pow(x,(2*i+1))/value;
        }
        System.out.println("Sum="+sum);
    }
}
