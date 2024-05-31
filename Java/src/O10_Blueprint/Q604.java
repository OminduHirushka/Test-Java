package O10_Blueprint;

interface Date {
    void setDate(int day, int month, int year);
    void setDay(int day);
    void setMonth(int month);
    void setYear(int year);

    int getDay();
    int getMonth();
    int getYear();

    void printDate();
}

class DateImplement implements Date {
    private int day;
    private int month;
    private int year;

    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void printDate() {
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }
}

public class Q604 {
    public static void main(String[] args) {
        Date date = new DateImplement();
        date.setDate(05, 06, 2000);
        date.printDate();
    }
}
