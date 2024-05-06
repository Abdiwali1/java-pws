package day7_5_6;

public class Either24 {
    public boolean either24(int[] nums) {

        boolean hasTwo = false;
        boolean hasFour = false;

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 2 && nums[i+1] == 2){
                hasTwo = true;
            } else if(nums[i] == 4 && nums[i+1] == 4){
                hasFour = true;
            }
        }

        return hasTwo ^ hasFour;
    }

}
