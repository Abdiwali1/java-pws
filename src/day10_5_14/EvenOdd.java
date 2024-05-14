package day10_5_14;

public class EvenOdd {
    public int[] evenOdd(int[] nums) { // 1, 10, 1, 10, 10, 1, 1
        int[] result = new int[nums.length]; // 10, 10, 10, 1, 1, 1, 1

        // i is the index to read from the nums array
        // e is the index to assign the even number in the beginning
        // o is the index to assign the odd numbers from the end

        for(int i = 0, e = 0, o = nums.length - 1; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                result[e++] = nums[i];
            } else {
                result[o--] = nums[i];
            }
        }
        return result;
    }

}
