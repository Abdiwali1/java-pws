package day4_4_23.warmup;

public class NoTriples {
    public boolean noTriples(int[] nums) {

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }

        return true;
    }

}