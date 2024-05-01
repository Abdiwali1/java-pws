package day6_4_30.array2;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {

        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for(int each : nums){
            min = Math.min(each, min);
            max = Math.max(each, max);
            sum += each;
        }

        sum -= min;
        sum -= max;

        return sum / (nums.length - 2);
    }
// 100, 0, 5, 3, 4]
// 100
// 0
// 5 + 3 + 4 = 12 / 3
}
