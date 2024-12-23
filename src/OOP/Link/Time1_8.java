package OOP.Link;

import java.sql.Time;

public class Time1_8 {
    private int hour;
    private int minute;
    private int second;
    public Time1_8(int hour, int minute, int second) {
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

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public String nextSecond(){
        if(second==59 && minute==59 && hour==23){
            second=0;
            minute=0 ;
            hour=0;
            return String.format("%02d:%02d:%02d", hour, minute, second) ;
        }
        second++;
        return String.format("%02d:%02d:%02d", hour, minute, second) ;
    }
    public String previousSecond(){
        if(second==0&& minute==0 && hour==0){
            hour=23;
            minute=59;
            second=59;
            return String.format("%02d:%02d:%02d", hour, minute, second) ;
        }
        second--;
        return String.format("%02d:%02d:%02d", hour, minute, second) ;
    }
    
}
