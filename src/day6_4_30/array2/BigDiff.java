package day6_4_30.array2;

public class BigDiff {
    public int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for(int each : nums){
            min = Math.min(each, min);
            max = Math.max(each, max);
        }

        // for(int each : nums){
        //   if(each < min){
        //     min = each;
        //   }
        // }

        return max - min;
    }

}
