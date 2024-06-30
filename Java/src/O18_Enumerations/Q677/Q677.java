package O18_Enumerations.Q677;

enum Color {
    RED(1001), GREEN(1002), BLACK(1003), BLUE(1004);              // Enum Objects

    private int code;

    Color(int code) {
        this.code = code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }
}

public class Q677 {
    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color.getCode());

        color.setCode(2001);
        System.out.println(color.getCode());
    }
}
