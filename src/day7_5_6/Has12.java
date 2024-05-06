package day7_5_6;

public class Has12 {
    public boolean has12(int[] nums) {

        boolean hasOne = false;
        boolean hasTwo = false;

        for(int each : nums){
            if(each == 1){
                hasOne = true;
            } else if(hasOne && each == 2){
                hasTwo = true;
            }
        }

        return hasTwo;
    }

/*
[2, 1, 4, 1, 6])  -> false
  boolean hasOne = true;
  boolean hasTwo = false;

([2, 1, 4, 1, 6, 2]) → true
  boolean hasOne = true;
  boolean hasTwo = false;

*/
}
