package day5_4_29;

public class RepeatSeparator {
    public String repeatSeparator(String word, String sep, int count) {
        String result = count > 0 ? word : "";

        for(int i = 1; i < count; i++){
            result += sep + word;
        }

        return result;

    }

}
