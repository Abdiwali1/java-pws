package day8_5_7;

public class ShiftLeft {
    public int[] shiftLeft(int[] nums) { //2, 5, 3, 3

        if(nums.length < 2){
            return nums;
        }

        int first = nums[0];
        for(int i = 0; i < nums.length - 1; i++){
            nums[i] = nums[i+1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }

}
