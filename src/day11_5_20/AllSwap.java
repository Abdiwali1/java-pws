package day11_5_20;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {
    public static void main(String[] args) {
        String[] arr = {"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"};
        System.out.println(Arrays.toString(allSwap(arr)));
    }
    public static String[] allSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();
        // key -> first char of each element
        // value -> index of the matching word. it matches b/c the first char is the same

        for(int i = 0; i < strings.length; i++){

            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key, i);
            } else {
                int index = map.get(key); // 0
                String temp = strings[index]; // ax
                strings[index] = strings[i]; // ay", "bx", "ax.."
                strings[i] = temp;
                map.remove(key);
            }

        }

        return strings;
    }
}
/*
"ax", "bx","ay", "by", "ai", "aj", "bx", "by",]) →

map = {

  b = 1
}
*/