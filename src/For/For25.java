package For;

import java.util.Scanner;

public class For25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0),x (|x|<1):");
        int n = input.nextInt();
        double x= input.nextDouble();
        double sum=0;
        for(int i=1;i<=n;i++){
            sum+=Math.pow((-1),(i-1))*Math.pow(x,i)/i;
        }
        System.out.println("Sum="+sum);
    }
}
