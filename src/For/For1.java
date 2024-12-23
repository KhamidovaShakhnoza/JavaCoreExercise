package For;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter K ,N (N>0):");
        int K = input.nextInt();
        int N = input.nextInt();
        for(int i=0;i<N;i++){
            System.out.println(K);
        }
    }
}
