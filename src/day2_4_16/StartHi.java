package day2_4_16;

public class StartHi {
    public boolean startHi(String str) {
        // str.charAt(0) == 'h' && str.charAt(1) == 'i'
        // str.substring(0,2).equals("hi")
        return str.startsWith("hi");
    }

}
