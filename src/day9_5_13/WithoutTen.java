package day9_5_13;

public class WithoutTen {
    public int[] withoutTen(int[] nums) {
        int[] result = new int[nums.length]; // [1, 2, 0, 0]

        // i is the index to read from nums
        // y is the index to assign to the result

        for(int i = 0, y = 0; i < nums.length; i++){
            if(nums[i] != 10){
                result[y++] = nums[i];
            }
        }

        return result;
    }

}
