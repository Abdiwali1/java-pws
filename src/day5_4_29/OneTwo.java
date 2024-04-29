package day5_4_29;

public class OneTwo {
    public String oneTwo(String str) {
        String result = "";
        for(int i = 0; i < str.length() - 2; i += 3){
            result += str.substring(i+1, i+3) + str.charAt(i);
        }

        return result;
    }

}
