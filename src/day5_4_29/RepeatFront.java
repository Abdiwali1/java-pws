package day5_4_29;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String result = ""; //ChocChoChC
        for(int i = n; i > 0; i--){ // i = 4 => 3 -> 2 ->  1 -> 0
            result += str.substring(0, i);
        }
        return result;
    }

}
