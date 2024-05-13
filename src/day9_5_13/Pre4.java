package day9_5_13;

public class Pre4 {
    public int[] pre4(int[] nums) {
        int index = indexOf4(nums);
        int[] result = new int[index];

        for(int i = 0; i < result.length; i++){
            result[i] = nums[i];
        }

        return result;
    }

    public int indexOf4(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4){
                return i;
            }
        }
        return -1;
    }
}
