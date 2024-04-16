package day2_4_16;

public class Close10 {
    public int close10(int a, int b) {
        int diffA = Math.abs(10 - a);
        int diffB = Math.abs(10 - b);
        return diffA < diffB ? a : diffB < diffA ? b : 0;
    }

}
