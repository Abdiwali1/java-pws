package day5_4_29;

public class SameStarChar {
    public boolean sameStarChar(String str) {

        for(int i = 1; i < str.length() - 1; i++){
            if(str.charAt(i) == '*'){
                if(str.charAt(i - 1)  != str.charAt(i + 1)){
                    return false;
                }
            }
        }

        return true;
    }

}