package day3_4_22;

public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("CodingHorror"));// → "Congrr"
    }
    public static String altPairs(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i != 0 && i % 2 == 0){
                i += 2;
            }
            if(i < str.length()){
                result += str.substring(i, i+1);
            }
        }
        return result;
    }


// when we get to an even index jump by 2
// 0 -> k
// 1 -> i
// 2 -> even -> + 2
// 4 -> e
// 5 -> n
// 6 -> even -> + 8
}
