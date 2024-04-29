package day5_4_29;

public class ZipZap {
    public String zipZap(String str) {

        if(str.length() < 3){
            return str;
        }

        String result = ""; //  zpXz
        for(int i = 0; i < str.length(); i++){ // 0 -> 1 -> 2
            char each = str.charAt(i);
            result += each;
            if(each == 'z' && str.charAt(i + 2) == 'p'){
                i++;
            }
        }
        return result;
    }

}
