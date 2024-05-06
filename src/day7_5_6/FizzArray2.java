package day7_5_6;

public class FizzArray2 {
    public String[] fizzArray2(int n) {
        String[] nums = new String[n];

        for(int i = 0; i < nums.length; i++){
            nums[i] = String.valueOf(i);
        }

        return nums;
    }

}
