package day8_5_7;

public class ModThree {
    public boolean modThree(int[] nums) { //2, 1, 3, 5

        for(int i = 0; i < nums.length - 2; i++){
            int current = nums[i]; // 2
            int second = nums[i+1]; // 1
            int third = nums[i+2]; // 3

            if(current % 2 == 0 && second % 2 == 0 && third % 2 == 0){ // all even
                return true;
            }else if(current % 2 == 1 && second % 2 == 1 && third % 2 == 1){ // all odd
                return true;
            }

            // another way to write
            // if((current % 2 == 0 && second % 2 == 0 && third % 2 == 0) ||
            // (current % 2 == 1 && second % 2 == 1 && third % 2 == 1)){
            //   return true;
            // }

            // another way to write
            // boolean areEven = current % 2 == 0 && second % 2 == 0 && third % 2 == 0;
            // boolean areOdd = current % 2 == 1 && second % 2 == 1 && third % 2 == 1;

            // if(areEven || areOdd){
            //   return true;
            // }

        }

        return false;
    }

}
