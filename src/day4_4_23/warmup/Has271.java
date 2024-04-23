package day4_4_23.warmup;

public class Has271 {
    public boolean has271(int[] nums) {  // 5 10 3

        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] + 5 == nums[i+1]){
                int result =  Math.abs((nums[i] - 1) - nums[i+2]);
                if(result <= 2){
                    return true;
                }
            }
        }

        return false;
    }
//  Math.abs((nums[i] - 1) - nums[i+2]);
// 2, 7, 1 -> Math.abs((2-1) - 1) -> Math.abs(1 - 1) = 0
// 2, 7, 3 -> Math.abs((2-1) - 3) -> Math.abs(1 - 3) = 2
// 2, 7, 4 -> Math.abs((2-1) - 4) -> Math.abs(1 - 4) = 3
}
