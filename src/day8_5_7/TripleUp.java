package day8_5_7;

public class TripleUp {
    public boolean tripleUp(int[] nums) {

        for(int i = 0; i < nums.length - 2; i++){
            int current = nums[i];

            if(current + 1 == nums[i+1] && current + 2 == nums[i+2]){
                return true;
            }
        }

        return false;
    }

}
