package day5_4_29;

public class MixString {
    public String mixString(String a, String b) {

        int max = Math.max(a.length(), b.length());
        String result = "";

        for(int i = 0; i < max; i++){

            if(i < a.length()){
                result += a.charAt(i);
            }
            if(i < b.length()){
                result += b.charAt(i);
            }

        }

        return result;

    }

}
