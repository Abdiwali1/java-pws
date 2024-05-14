package day10_5_14;

import java.util.Arrays;

public class Fix34 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        System.out.println(Arrays.toString(fix34(nums)));
    }
    public static int[] fix34(int[] nums) { //[3, 4, 2, 2]

        int four = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == 3){
                for(int j = four; j < nums.length; j++){

                    if(nums[j] == 4){
                        int temp = nums[i+1]; // 2
                        nums[i+1] = 4;
                        nums[j] = temp;
                        four = j;
                        break;
                    }

                }
            }
        }

        return nums;

    }

// i + 1 -> index next to the 3
// j -> index of the next 4


//[5) → [5, 3, 4, 5, 5, 5, 5, 5, 3, 4, 3, 4]
}
