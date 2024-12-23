package Switch;

import java.util.Scanner;

public class Case11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter C (initial location) ,N (instruction):");
        char C = input.next().charAt(0);
        int N = input.nextInt();
        switch(N) {
            case (1):
                switch (C) {
                    case('N'):
                        C='W';
                        break;
                    case 'W':
                        C= 'S';
                        break;
                    case 'S':
                        C= 'E';
                        break;
                    case 'E':
                        C='N';
                        break;
                    default:
                        System.out.println("No such a direction!");
                        break;
                }
            case (-1):
                switch (C) {
                    case('N'):
                        C='E';
                        break;
                    case 'W':
                        C= 'N';
                        break;
                    case 'S':
                        C= 'W';
                        break;
                    case 'E':
                        C='S';
                        break;
                    default:
                        System.out.println("No such a direction!");
                        break;
                }
            case (2):
                switch (C) {
                    case ('N'):
                        C = 'S';
                        break;
                    case 'W':
                        C = 'E';
                        break;
                    case 'S':
                        C = 'N';
                        break;
                    case 'E':
                        C = 'W';
                        break;
                    default:
                        System.out.println("No such a direction!");
                        break;
                }
System.out.println("Final Direction is "+C);
        }}
    }