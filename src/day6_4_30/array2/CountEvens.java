package day6_4_30.array2;

public class CountEvens {
    public int countEvens(int[] nums) {
        int count = 0;
        for(int each : nums){
            if(each % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
