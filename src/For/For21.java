package For;

import java.util.Scanner;

public class For21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        double product=1;
        double sum=0;
        for(int i= 1;i<=n;i++){
            product*=i;
            sum+=1/product;
        }
        System.out.println(sum);
    }
}
