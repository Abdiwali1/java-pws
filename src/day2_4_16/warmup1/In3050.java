package day2_4_16.warmup1;

public class In3050 {
    public boolean in3050(int a, int b) {
        return (a >= 30 && a <= 40 && b >= 30 && b <= 40) ||
                (a >= 40 && a <= 50 && b >= 40 && b <= 50);
        //return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
        //((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

}
