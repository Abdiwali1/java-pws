package day3_4_22;

public class StringX {
    public String stringX(String str) {
        int len = str.length();
        if (len < 2) {
            return str;
        } else {
            return str.charAt(0) + str.substring(1, len - 1).replace("x", "") + str.charAt(len - 1);
        }
    }

    public String stringX2(String str) {
        return str.length() < 2 ? str : str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(str.length() - 1);
    }

}
