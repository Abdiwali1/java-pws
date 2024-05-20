package day11_5_20;

public class CanBalance {
    public boolean canBalance(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            int sumFirst = 0;
            int sumLast = 0;

            for(int f = 0; f <= i; f++){ // i is the last number for the first group
                sumFirst += nums[f];
            }

            for(int l = i + 1; l < nums.length; l++){ // l is the starting point for the last group
                sumLast += nums[l];
            }

            if(sumFirst == sumLast){
                return true;
            }

        }

        return false;
    }
/*
  [1, 1, 1, 2, 1]

  i = 0
    sumFirst = 1
    sumLast = 1, 1, 2, 1

  i = 1
    sumFirst = 1, 1
    sumLast =  1, 2, 1

  i = 3
    sumFirst = 1, 1, 1
    sumLast =  2, 1

*/
}
