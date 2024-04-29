package day5_4_29;

public class PrefixAgain {
    public boolean prefixAgain(String str, int n) {
        String first = str.substring(0, n);
        return str.substring(n).contains(first);
    }

}
