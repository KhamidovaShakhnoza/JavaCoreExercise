package BookOOP.Ch10.Ex1;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(System.currentTimeMillis());
    }
    public Time(long elapsedTime) {
        setTime(elapsedTime);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setTime(long elapseTime) {
        long elapsedTime = elapseTime / 1000;
        long secondsToday = elapsedTime % (60 * 60*24);
        long second=secondsToday%60;
        long minutesToday = secondsToday/60;
        long minute=minutesToday%60;
        long hour=minutesToday/60;

        this.second=(int)second;
        this.minute=(int)minute;
        this.hour=(int)hour;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
