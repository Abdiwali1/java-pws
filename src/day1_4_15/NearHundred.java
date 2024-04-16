package day1_4_15;

public class NearHundred {
    public boolean nearHundred(int n) {
        return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10;
        //return (n >= 90 && n <= 110) || (n >= 190 && n <= 210);
    }
// 90 - n - 110
// 190 - n - 210

//Math.abs(100 - 93) <= 10 -> 7 <= 10
//Math.abs(100 - 105) <= 10 -> 5 <= 10
}