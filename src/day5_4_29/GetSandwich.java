package day5_4_29;

public class GetSandwich {
    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if(first == last || str.length() < 5){
            return "";
        }

        return str.substring(first + 5, last);
    }

}
