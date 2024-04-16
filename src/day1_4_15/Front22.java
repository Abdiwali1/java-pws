package day1_4_15;

public class Front22 {
    public String front22(String str) {
        String toAdd;
        if(str.length() < 2){
            toAdd = str;
        } else {
            toAdd = str.substring(0,2);
        }

        return toAdd + str + toAdd;
    }

}
