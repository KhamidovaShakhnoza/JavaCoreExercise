package OOP.Link;

public class Time1_8Test {
    public static void main(String[] args) {
        // Test constructors and toString()
        Time1_8 t1 = new Time1_8(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        t1.nextSecond();
        System.out.println(t1.nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        t1.previousSecond();
        System.out.println(t1.previousSecond());
    }
}
