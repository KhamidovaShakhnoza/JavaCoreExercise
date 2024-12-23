package Arrays;

import java.util.Scanner;

public class Array40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.print("Enter R: ");
        double R = input.nextDouble();
        System.out.println("Enter elements of array :");
        double[] array;
        array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        double min =Math.abs((array[0] - R));
        int count=1;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs((array[i] - R)) < min){
                min = Math.abs((array[i] - R));
                count++;
            }
        }
        System.out.println(array[count]);
    }
}
