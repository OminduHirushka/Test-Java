package Assignment.O2_OOP.A1.Q35;

class Date {
    public static final int YEAR = 0;
    public static final int MONTH = 1;
    public static final int DAY = 2;

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

    public void set(int field, int value) {
        switch (field) {
            case YEAR:
                setYear(value);
                break;
            case MONTH:
                setMonth(value);
                break;
            case DAY:
                setDay(value);
                break;
            default:
                throw new IllegalArgumentException("Invalid field: " + field);
        }
    }
}

public class Q35 {
    public static void main(String[] args) {
        Date d1 = new Date();
        d1.printDate();                     // 1970-1-1
        d1.setYear(2016);
        d1.setMonth(5);
        d1.setDay(31);
        System.out.println("Year : " + d1.getYear());
        System.out.println("Month : " + d1.getMonth());
        System.out.println("Day : " + d1.getDay());

        Date d2 = new Date();
        d2.set(Date.YEAR, 2016);
        d2.set(Date.MONTH, 5);
        d2.set(Date.DAY, 30);
        d2.printDate();                      // 016-5-30
    }
}
