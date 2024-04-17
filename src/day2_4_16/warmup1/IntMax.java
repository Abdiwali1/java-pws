package day2_4_16.warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        // if(a > b && a > c){
        //   return a;
        // } else if(b > a && b > c){
        //   return b;
        // } else {
        //   return c;
        // }

        return (a > b && a > c) ? a : (b > a && b > c) ? b : c;
    }

}
