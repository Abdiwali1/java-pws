package day1_4_15;

public class BackAround {
    public String backAround(String str) {

        char lastChar = str.charAt(str.length() - 1);
        return lastChar + str + lastChar;

    }

}
