package For;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        int sum=0;
        for(int i=n;i<=2*n;i++){
            sum+=i*i;
        }
        System.out.println("Sum="+sum);
    }
}
