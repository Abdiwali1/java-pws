package day5_4_29;

public class RepeatEnd {
    public static void main(String[] args) {
        System.out.println(repeatEnd("Hello", 3));
    }

    public static String repeatEnd(String str, int n) {
        String last = str.substring(str.length() - n);
        // return last.repeat(n);
        String result = "";
        for(int i = 0; i < n; i++){
            result += last;
        }
        return result;
    }

}
