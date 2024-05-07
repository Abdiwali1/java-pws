package day8_5_7;

public class FizzArray3 {
    // public int[] fizzArray3(int start, int end) {
//   int [] nums = new int[end - start];

//   for(int i = 0, number = start; i < nums.length; i++, number++){
//     nums[i] = number;
//   }

//   return nums;
// }

    public int[] fizzArray3(int start, int end) {
        int [] nums = new int[end - start];

        for(int i = 0; i < nums.length; i++){
            nums[i] = start + i;
        }

        return nums;
    }

}
