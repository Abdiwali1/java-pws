package day1_4_15;

public class SleepIn {

    public static void main(String[] args) {
        System.out.println(sleepIn(true, false));// !true -> false || false
        System.out.println(sleepIn(true, true));// !true -> false || true
        System.out.println(sleepIn(false, true));// !false -> true || true
    }

    // if you want to test the method in intellij, make it static
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

}
