package day4_4_23.string2;

public class DoubleChar {
    public String doubleChar(String str) {
        String result = "";
        for(int i= 0; i < str.length(); i++){
            char each = str.charAt(i);
            result += "" + each + each;
        }
        return result;
    }

}
