package day7_5_6;

public class Lucky13 {
    public boolean lucky13(int[] nums) {

        for(int each : nums){
            if(each == 1 || each == 3){
                return false;
            }
        }

        return true;
    }

}
