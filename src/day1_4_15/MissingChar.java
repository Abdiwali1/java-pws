package day1_4_15;

public class MissingChar {
    public String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n + 1);
    }
}