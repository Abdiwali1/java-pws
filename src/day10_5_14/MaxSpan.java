package day10_5_14;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        int span = 0;
        for(int i = 0; i < nums.length; i++){ // nums[0] = 1

            for(int j = nums.length - 1; j >= 0; j--){
                if(nums[i] == nums[j]){
                    int diff = j - i + 1; // +1 converts from index to how numbers we have
                    span = Math.max(span, diff);
                    break;
                }
            }

        }

        return span;

    }

}
