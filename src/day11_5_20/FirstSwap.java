package day11_5_20;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {
    public String[] firstSwap(String[] strings) {

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < strings.length; i++){

            char key = strings[i].charAt(0);

            if(!map.containsKey(key)){
                map.put(key, i);
            } else if(map.get(key) != -1){
                int index = map.get(key); // 0
                String temp = strings[index]; // ax
                strings[index] = strings[i]; // ay", "bx", "ax.."
                strings[i] = temp;
                map.put(key, -1);
            }

        }

        return strings;
    }

}
