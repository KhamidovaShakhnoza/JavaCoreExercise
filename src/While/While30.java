package While;

import java.util.Scanner;

public class While30 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter A, B, C :");
        double A= input.nextDouble();
        double B= input.nextDouble();
        double C= input.nextDouble();

        int countA=0;
        int countB=0;
        double tempA=A;
        while (tempA >= C) {
            tempA -= C;
            countA++;
        }
        double tempB=B;
        while (tempB >= C) {
            tempB -= C;
            countB++;
        }
        int totalSquares = 0;
        int i = 0;
        while (i < countB) {
            totalSquares += countA;
            i++;
        }

        System.out.println("The number of squares that can fit: " + totalSquares);

    }
}
