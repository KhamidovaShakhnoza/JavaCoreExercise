package For;

import java.util.Scanner;

public class For9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b (a<b):");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum=0;
        for(int i=b-1;i>a;i--) {
            sum += i*i;
        }
        System.out.println("Sum="+sum);
    }
}
