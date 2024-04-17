package day2_4_16.warmup1;

public class StringE {
    public boolean stringE(String str) {
        int original = str.length();
        str = str.replace("e", "");
        int numberOfE = original - str.length();

        return numberOfE >= 1 && numberOfE <= 3;
    }

}
