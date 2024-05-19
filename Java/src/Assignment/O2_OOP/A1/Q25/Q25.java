package Assignment.O2_OOP.A1.Q25;

class Date {
    private int year = 1970;
    private int month = 1;
    private int day = 1;

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void printDate() {
        System.out.println(year + "-" + month + "-" + day);
    }
}

public class Q25 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.printDate();                     // 1970-1-1
        /*
        d1.year = 2016;
        d1.month = 5;
        d1.day = 30;
        */

        d1.setYear(2016);
        d1.setMonth(5);
        d1.setDay(31);

        System.out.println("Year : " + d1.getYear());
        System.out.println("Month : " + d1.getMonth());
        System.out.println("Day : " + d1.getDay());
    }
}
