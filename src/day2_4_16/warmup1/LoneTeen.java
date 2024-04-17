package day2_4_16.warmup1;

public class LoneTeen {
    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19); //^ or but only one can be true
    }

}
