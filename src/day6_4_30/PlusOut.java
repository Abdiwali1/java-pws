package day6_4_30;

public class PlusOut { // few of the test cases not passing
    public String plusOut(String str, String word) {
        String result = "";
        for(int i = 0; i <= str.length() - word.length(); i++){
            String eachN = str.substring(i, i + word.length());
            if(eachN.equals(word)){
                result += eachN;
                i++;
            } else {
                result += '+';
            }

            if(i == str.length() - word.length()){
                result += "+";
            }
        }

        return result;
    }
/*12xy34   i,i + 2
12 -> +     0, 2
2x -> ++    1, 3
xy -> ++xy

34 -> ++xy+

*/
}
