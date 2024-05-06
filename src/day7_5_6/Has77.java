package day7_5_6;

public class Has77 {
    public boolean has77(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == 7){

                if(nums[i+1] == 7 || (i < nums.length - 2 && nums[i+2] == 7)){
                    return true;
                }

            }
        }

        return false;
    }

//
//    public boolean has77(int[] nums) {
//        int len = nums.length;
//        for(int i = 0; i < len - 2; i++){
//            if(nums[i] == 7){
//
//                if(nums[i+1] == 7 || nums[i+2] == 7){
//                    return true;
//                }
//
//            }
//        }
//
//        return len > 2 ? (nums[len - 1] == 7 && nums[len - 2] == 7) : false;
//    }

}
