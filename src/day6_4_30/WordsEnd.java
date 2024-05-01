package day6_4_30;

import java.util.Arrays;

public class WordsEnd {
    public static void main(String[] args) {
       // wordEnds("abcXY123XYijk", "XY")
        String str = "abcXY123XYijk";
        System.out.println(Arrays.toString(str.split("XY")));
        System.out.println(Arrays.toString("XY123XY".split("XY")));

        System.out.println();
        System.out.println(wordEnds("XY123XY", "XY")); //"13"

    }
    public static String wordEnds(String str, String word) {

        String[] arr = str.split(word); //[abc, 123, ijk]
        String result = arr[0].isEmpty() ? "" : "" + arr[0].charAt(arr[0].length() - 1);
        for(int i = 1; i < arr.length; i++){
            String each = arr[i];
            result += "" + each.charAt(0) + each.charAt(each.length() - 1);
        }

        //result +=  arr[arr.length - 1].isEmpty() ? "" : arr[arr.length - 1].charAt(0);

        return result;
    }

}
