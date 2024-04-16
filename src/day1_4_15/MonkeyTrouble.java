package day1_4_15;

public class MonkeyTrouble {
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
        //return (aSmile && bSmile) || (!aSmile && !bSmile);
    }
// 1. both smile -> true
// 2. none smile -> true
}
