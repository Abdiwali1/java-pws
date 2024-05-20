package day11_5_20;

public class Fix45 {
    public int[] fix45(int[] nums) {
        String swapedIndex = "";
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4){

                for(int j = 0; j < nums.length; j++){
                    if(nums[j] == 5 && !swapedIndex.contains("" + j)){
                        nums[j] = nums[i+1]; // 9
                        nums[i+1] = 5;
                        swapedIndex += (i + 1);
                    }
                }
            }
        }
        return nums;
    }

//9, 4, 5, 4, 9, 5

}
