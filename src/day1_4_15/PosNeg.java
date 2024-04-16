package day1_4_15;

public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {

        if(negative){ // if the negative boolean is true, both numbers must be negative
            return a < 0 && b < 0;
        }

        return (a < 0 && b > 0) || (a > 0 && b < 0); // this return runs when the negative boolean is false
        // checks if only one is postive and the other is negative
    }
}
