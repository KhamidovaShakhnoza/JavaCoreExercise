package Integer;

import java.util.Scanner;

public class Integer26 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter one day in a year (1<K<365): ");
        int K= input.nextInt();
        int a=(K)%7;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[a]);
    }
}
