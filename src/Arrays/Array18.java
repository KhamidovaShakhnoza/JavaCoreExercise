package Arrays;

import java.util.Scanner;

public class Array18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*100);
        }
        printArray(numbers);
        int i;
        for ( i = 0; i <numbers.length-1 ; i++) {
            if(numbers[i]<numbers[numbers.length-1]){
                System.out.println(numbers[i]);
                break;
            }
        }
        if (i==numbers.length-1) System.out.println(0);
    }

    static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }
}
