package day7_5_6;

public class Only14 {
    public boolean only14(int[] nums) {

        for(int each : nums){
            if(each != 1 && each != 4){ //if(!(each == 1 || each == 4)){
                return false;
            }
        }

        return true;
    }

}
