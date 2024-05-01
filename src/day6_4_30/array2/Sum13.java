package day6_4_30.array2;

public class Sum13 {
    // public int sum13(int[] nums) {
//   int sum = 0;
//   boolean skip = false;
//   for(int each : nums){
//     if(skip || each == 13){
//       skip = !skip;
//       continue;
//     }
//     sum += each;
//   }
//   return sum;
// }
    public int sum13(int[] nums) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++){ //[13, 1, 2, 13, 2, 1, 13]) → 3
            if(nums[i] == 13){
                i++;
                continue;
            }
            sum += nums[i];
        }
        return sum;
    }

}
