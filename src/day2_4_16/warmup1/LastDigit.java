package day2_4_16.warmup1;

public class LastDigit {
    public boolean lastDigit(int a, int b) {
        // int aLast = a % 10;
        // int bLast = b % 10;
        // return aLast == bLast;

        return a % 10 == b % 10;
    }

}
