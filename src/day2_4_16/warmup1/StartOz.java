package day2_4_16.warmup1;

public class StartOz {
    public String startOz(String str) {
        String result = "";

        if(str.length() >= 2){
            if(str.charAt(0) == 'o'){
                result += 'o';
            }
            if(str.charAt(1) == 'z'){
                result += 'z';
            }
        } else {
            result = str;
        }

        return result;
    }

    public String startOz2(String str) {

        if(str.length() < 2){
           return str;
        }

        String result = "";

        if(str.charAt(0) == 'o'){
            result += 'o';
        }
        if(str.charAt(1) == 'z'){
            result += 'z';
        }
        return result;
    }

}
