package day3_4_22;

public class ArrayCount9 {
    public static void main(String[] args) {
        int[] nums = {4, 9, 3, 4, 9};
        System.out.println(arrayCount9(nums));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int each : nums) {
            if (each == 9) {
                count++;
            }
        }
        return count;
    }
}
