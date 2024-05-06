package day7_5_6;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int count = 0; // find the number of 2 in our array

        for(int each : nums){
            if(each == 2){
                count++;
            }
        }

        return count == 4; // when count is 4 the sum would be 8
    }

}
