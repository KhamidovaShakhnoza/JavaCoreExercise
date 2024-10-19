package Integer;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter one day in a year (1<=K<=365) and day in a week (1<=N<=7): ");
        int K= input.nextInt();
        int N= input.nextInt();
        int a=(K+N-1)%7;

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(days[a]);
    }
}
