package day11_5_20;

import java.util.HashMap;
import java.util.Map;

public class WordAppend {
    public String wordAppend(String[] strings) {

        String result = "";
        Map<String, Integer> counter = new HashMap<>();

        for(String key : strings){

            if(!counter.containsKey(key)){
                counter.put(key, 0);
            }

            counter.put(key, counter.get(key) + 1);

            if(counter.get(key) % 2 == 0){
                result += key;
            }

        }

        return result;

    }
/* "a", "c", "a", "c", "a", "d", "a"

  counter = {
    a = 3;
    c = 2
    d = 1
  }

*/
}
