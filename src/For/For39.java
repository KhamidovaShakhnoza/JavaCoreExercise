package For;

import java.util.Scanner;

public class For39 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter positive A and B (A<B),K:");
        int A= input.nextInt();
        int B= input.nextInt();
        int K= input.nextInt();
        for(int i=A;i<=B;i++) for(int k=1;k<=K;k++) System.out.print(i+"; ");
    }
}
