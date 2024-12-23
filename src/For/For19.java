package For;

import java.util.Scanner;

public class For19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n (n>0):");
        int n = input.nextInt();
        int product=1;
        for(int i= 1;i<=n;i++){
            product*=i;
        }
        System.out.println("Product is "+product);
    }
}
