package day8_5_7;

public class HaveThree {
    public boolean haveThree(int[] nums) {
        int count = 0;

         for(int i = 0; i < nums.length; i++){
           if(nums[i] == 3){

             if(i < nums.length - 1 && nums[i+1] == 3){ //i < nums.length - 1 -> check the number next to it, except for the last index
               return false;
             }

             count++;
           }
         }

        // another approach. solve most
//        for(int i = 0; i < nums.length - 1; i++){
//            if(nums[i] == 3){
//
//                if(nums[i+1] == 3){
//                    return false;
//                }
//
//                count++;
//            }
//        }
//
//        if(nums[nums.length - 1] == 3){ // checks if the last number is 3
//            count++;
//        }

        return count == 3;
    }

}
