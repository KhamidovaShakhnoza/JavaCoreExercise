package Switch;

import java.util.Scanner;

public class Case19 {
    public static void main(String[] args) {
        Scanner input =new Scanner((System.in));
        System.out.println("Enter a year (1984<=Y): ");
        int Y=input.nextInt();
        int offset=Y-1984;
        int color =offset%5;
        int animal=offset%12;
        String Color="";
        String Animal="";
        switch (color) {
            case (0): Color = "Green";break;
            case (1): Color = "Red";break;
            case (2): Color = "Yellow";break;
            case (3): Color = "White";break;
            case (4): Color = "Black";break;
        }
        switch (animal) {
            case (0): Animal = "Rat";break;
            case (1): Animal = "Cow";break;
            case (2): Animal = "Tiger";break;
            case (3): Animal = "Hare";break;
            case (4): Animal = "Dragon";break;
            case (5): Animal = "Snake";break;
            case (6): Animal = "Horse";break;
            case (7): Animal = "Sheep";break;
            case (8): Animal = "Monkey";break;
            case (9): Animal = "Hen";break;
            case (10): Animal = "Dog";break;
            case (11): Animal = "Pig";break;
        }
        System.out.println("The "+Color+" "+Animal+"s year");
    }
}
