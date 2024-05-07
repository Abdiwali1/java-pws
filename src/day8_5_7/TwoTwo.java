package day8_5_7;

public class TwoTwo {
    public boolean twoTwo(int[] nums) { // 2, 2, 4, 2 come back 7 10 est+

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == 2){

                if(nums[i-1] != 2 && (i == nums.length - 1 || nums[i+1] != 2)){
                    return false;
                }
            }
        }

        return nums.length == 1 && nums[0] == 2 ? false : true;
    }


    // for(int i = 0; i < nums.length; i++){
    //   if(nums[i] == 2){

    //     if(i < nums.length - 2 && nums[i+1] == 2){
    //       i++;
    //     } else {
    //       return false;
    //     }

    //   }
    // }

}
