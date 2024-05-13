package day9_5_13;

public class Post4 {
    public int[] post4(int[] nums) {

        int index = lastIndexOf4(nums);
        int[] result = new int[nums.length - index - 1];

        for(int i = 0; i < result.length; i++){
            result[i] = nums[index + i + 1];
        }

        // for(int i = 0, y = index + 1; i < result.length; i++, y++){ // y is the index after the last 4
        //   result[i] = nums[y];
        // }

        return result;
    }

    public int lastIndexOf4(int nums[]){
        int index = -1;

        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 4){
                index = i;
                break;
            }
        }

        return index;
    }
}
