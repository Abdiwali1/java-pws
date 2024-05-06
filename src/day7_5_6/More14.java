package day7_5_6;

public class More14 {
    public boolean more14(int[] nums) {
        int one = 0;
        int four = 0;

        for(int each : nums){
            if(each == 1){
                one++;
            } else if(each == 4){
                four++;
            }
        }

        return one > four;
    }

}
