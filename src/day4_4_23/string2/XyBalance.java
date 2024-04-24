package day4_4_23.string2;

public class XyBalance {
    public boolean xyBalance(String str) {

        for(int i = 0; i < str.length(); i++){
            String letter = str.substring(i, i+1);
            if(letter.equals("x") && !str.substring(i).contains("y")){
                return false;
            }
        }

        return true;
    }

}
