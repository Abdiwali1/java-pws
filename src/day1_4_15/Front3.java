package day1_4_15;

public class Front3 {
    public static void main(String[] args) {
        System.out.println(front3("a"));
    }
    public static String front3(String str) {

        if(str.length() < 3){
            return str.repeat(3);
        }

        String first = str.substring(0, 3);
        return first + first + first;
    }

//    public String front3(String str) {
//
//        if(str.length() < 3){
//            return str + str + str;
//        }
//
//        String first = str.substring(0, 3);
//        return first + first + first;
//    }

}
