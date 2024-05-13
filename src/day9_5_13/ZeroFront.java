package day9_5_13;

public class ZeroFront {
    public int[] zeroFront(int[] nums) { // [5, 0, 5, 0, 5]
        int[] result = new int[nums.length]; //[0, 0, 5, 5, 5]

        for(int i = 0, y = nums.length - 1; i < nums.length; i++){ // y is the index to assign the numbers to the result from the end
            if(nums[i] != 0){
                result[y--] = nums[i];
            }
        }
        return result;
    }

}
