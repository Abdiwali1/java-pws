package day2_4_16.warmup1;

public class EndUP {
    public String endUp(String str) {
        int len = str.length();
        if(len >= 3){
            str = str.substring(0, len - 3) + str.substring(len - 3).toUpperCase();
        }else {
            str = str.toUpperCase();
        }

        return str;
    }


}
