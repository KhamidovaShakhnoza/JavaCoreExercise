package BookOOP.Ch10.Ex14;

import java.time.LocalDate;
import java.util.Date;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        LocalDate localDate = LocalDate.now();
        this.year = localDate.getYear();
        this.month = localDate.getMonthValue();
        this.day = localDate.getDayOfMonth();
    }
    public MyDate(long elapsedTime) {
        int days=(int) (elapsedTime / 86400000);
        int year= (days / 365);
        int m=days % 365;
        int months=m/30;
        int day=m%30;
        this.year=year+1970;
        this.month=months;
        this.day=day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
    public void setDate(long elapsedTime){

    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }
}
