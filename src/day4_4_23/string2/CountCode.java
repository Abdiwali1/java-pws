package day4_4_23.string2;

public class CountCode {
    public int countCode(String str) {
        int count = 0;
        for(int i = 0; i < str.length() - 3; i++){
            String eachFour = str.substring(i, i+2) + "d" + str.charAt(i + 3); // i is the first char for each 4 lettered words
            if(eachFour.equals("code")){
                count++;
            }
        } // coze -> i, i+4
        return count;
    }


}
