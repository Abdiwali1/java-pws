package day11_5_20;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {
    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for(String each : strings){
            if(map.containsKey(each)){
                map.put(each, true);
            } else {
                map.put(each, false);
            }
        }
        return map;
    }

}
