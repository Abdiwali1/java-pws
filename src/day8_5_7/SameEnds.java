package day8_5_7;

public class SameEnds {
    public boolean sameEnds(int[] nums, int len) { // 3, 4, 5, 3 | n = 1

        for(int i = 0; i < len; i++){
            if(nums[i] != nums[nums.length - len + i]){
                return false;
            }
        }

        return true;
    }


/*


 [5, 6, 45, 99, 5, 6, 45], 3)

 if(nums[i] != nums[nums.length - len + i]){
when i = 0;     nums[7 - 3 + 0] -> nums[4]
    5 != 5

when i = 1;     nums[7 - 3 + 1] -> nums[5]
    6 != 6


 */
}
