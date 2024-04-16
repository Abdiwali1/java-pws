package day1_4_15;

public class diff21 {
    public int diff21(int n) {
        int diff = Math.abs(21 - n);
        if(n > 21){
            diff *= 2;
        }
        return diff;
    }

}
