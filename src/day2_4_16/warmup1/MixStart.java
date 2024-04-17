package day2_4_16.warmup1;

public class MixStart {
    public boolean mixStart(String str) {
        return str.length() >= 3 ? (str.charAt(1) == 'i' && str.charAt(2) == 'x') : false;
    }

}
