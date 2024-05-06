package day7_5_6;

public class FizzArray {
    public int[] fizzArray(int n) {

        int[] nums = new int[n];

        for(int i = 1; i < nums.length; i++){
            nums[i] = i;
        }

        return nums;
    }

}
