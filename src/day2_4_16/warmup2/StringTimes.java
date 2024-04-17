package day2_4_16.warmup2;

public class StringTimes {
    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }// str.repeat(n)

}
