package day1_4_15;

public class NotString {
    public String notString(String str) {
        // if(str.startsWith("not")){
        //   return str;
        // } else {
        //   return "not " + str;
        // }

        //return str.startsWith("not") ? str : "not " + str;
        return  (str.startsWith("not") ? "" : "not ") + str;
    }

}
