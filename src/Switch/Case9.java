package Switch;

import java.util.Scanner;

public class Case9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day :");
        int D = input.nextInt();
        System.out.print("Enter Month:");
        int M = input.nextInt();
        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                switch (D / 31) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M++;
                        break;
                }
            case 2:
                switch (D / 28) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M = 3;
                        break;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                switch (D / 30) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M++;
                        break;
                }
            case 12:
                switch (D / 31) {
                    case 0:
                        D++;
                        break;
                    case 1:
                        D = 1;
                        M = 1;
                        break;
                }
            System.out.println("Day=" + D + "; Month=" + M);

        }
        }

    }

