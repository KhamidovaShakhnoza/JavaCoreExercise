package For;

import java.util.Scanner;

public class For23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0),x:");
        int n = input.nextInt();
        double x= input.nextDouble();
        double sum=0;
        double product=1;
        for (int i=0;i<=n;i++){
            for(int k=1;k<=2*i+1;k++){
                product*=k;
            }
            sum+=Math.pow((-1),i)*Math.pow(x,(2*i+1))/(product);
        }
        System.out.println(sum);
        System.out.println(Math.sin(x));
    }
}
