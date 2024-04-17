package day2_4_16.warmup1;

public class Max1020 {
    public int max1020(int a, int b) {
        int result = 0;

        if(a >= 10 && a <= 20){
            result = a;
        }

        if(b >= 10 && b <= 20){
            result = Math.max(b, result); // a > b ? a : b
        }

        return result;
    }

}
