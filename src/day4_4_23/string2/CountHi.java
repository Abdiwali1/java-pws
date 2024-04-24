package day4_4_23.string2;

public class CountHi {
    public int countHi(String str) {
        int count = 0;
        while(str.contains("hi")){
            count++;
            str = str.replaceFirst("hi", "");
        }

        return count;
    }

}
