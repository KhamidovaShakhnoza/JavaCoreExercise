package Arrays;

import java.util.Scanner;

public class Array41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        System.out.println("Enter elements of array :");
        int[] array;
        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        int max =array[0]+array[1];
        int count=1;
        for (int i = 2; i < array.length; i++) {
            if ((array[i-1]+array[i])>max){
                max = (array[i-1]+array[i]);
                count++;
            }
        }
        System.out.println(max+" "+array[count]+" "+array[count-1]);
    }
}
