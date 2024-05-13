package day9_5_13;

public class TenRun {
    public int[] tenRun(int[] nums) {
        boolean found10 = false; // true
        int tenNum = 0; // 10

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 10 == 0){
                found10 = true;
                tenNum = nums[i];
            } else if(found10){
                nums[i] = tenNum;
            }
        }

        return nums;
    }

}
